package com.bank.accounts.domain.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Currency {
    PEN(1, "PEN", "S/"),
    USD(2, "USD", "$");

    private final int id;
    private final String code;
    private final String symbol;

    Currency(int id, String code, String symbol) {
        this.id = id;
        this.code = code;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @JsonValue
    public String toJson() {
        return code;
    }

    @JsonCreator
    public static Currency from(Object value) {
        if (value == null) return null;
        if (value instanceof Number) {
            return fromId(((Number) value).intValue());
        }
        String s = String.valueOf(value).trim();
        try {
            int numeric = Integer.parseInt(s);
            return fromId(numeric);
        } catch (NumberFormatException ignored) {
        }
        return fromCode(s);
    }

    public static Currency fromId(int id) {
        for (Currency c : values()) {
            if (c.id == id) return c;
        }
        throw new IllegalArgumentException("Unknown Currency id: " + id);
    }

    public static Currency fromCode(String code) {
        if (code == null) return null;
        String normalized = code.trim().toUpperCase();
        for (Currency c : values()) {
            if (c.code.equalsIgnoreCase(normalized) || c.name().equalsIgnoreCase(normalized)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Unknown Currency code: " + code);
    }
}
