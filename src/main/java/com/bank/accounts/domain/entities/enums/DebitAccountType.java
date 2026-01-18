package com.bank.accounts.domain.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DebitAccountType {
    AHORROS(1, "AHORROS", "Ahorros"),
    CORRIENTE(2, "CORRIENTE", "Corriente");

    private final int id;
    private final String code;
    private final String label;

    DebitAccountType(int id, String code, String label) {
        this.id = id;
        this.code = code;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    @JsonValue
    public String toJson() {
        return code;
    }

    @JsonCreator
    public static DebitAccountType from(Object value) {
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

    public static DebitAccountType fromId(int id) {
        for (DebitAccountType t : values()) {
            if (t.id == id) return t;
        }
        throw new IllegalArgumentException("Unknown DebitAccountType id: " + id);
    }

    public static DebitAccountType fromCode(String code) {
        if (code == null) return null;
        String normalized = code.trim().toUpperCase();
        for (DebitAccountType t : values()) {
            if (t.code.equalsIgnoreCase(normalized) || t.name().equalsIgnoreCase(normalized)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown DebitAccountType code: " + code);
    }
}
