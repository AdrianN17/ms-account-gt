package com.bank.accounts.domain.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum CardType {
    DEBIT(1, "DEBIT", "Debit Card"),
    CREDIT(2, "CREDIT", "Credit Card");

    private final int id;
    private final String code;
    private final String label;

    CardType(int id, String code, String label) {
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

    @Override
    public String toString() {
        return code;
    }

    @JsonValue
    public String toJson() {
        return code;
    }

    @JsonCreator
    public static CardType from(Object value) {
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

    public static CardType fromId(int id) {
        for (CardType t : values()) {
            if (t.id == id) return t;
        }
        throw new IllegalArgumentException("Unknown CardType id: " + id);
    }

    public static CardType fromCode(String code) {
        if (code == null) return null;
        String normalized = code.trim().toUpperCase();
        for (CardType t : values()) {
            if (t.code.equalsIgnoreCase(normalized) || t.name().equalsIgnoreCase(normalized)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown CardType code: " + code);
    }
}
