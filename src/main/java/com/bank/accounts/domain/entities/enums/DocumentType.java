package com.bank.accounts.domain.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DocumentType {
    DNI(1, "DNI", "DNI"),
    CE(2, "CE", "Carnet de Extranjería"),
    PS(3, "PS", "Pasaporte"),
    RUC(4, "RUC", "RUC");

    private final int id;
    private final String code;
    private final String label;

    DocumentType(int id, String code, String label) {
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
    public static DocumentType from(Object value) {
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

    public static DocumentType fromId(int id) {
        for (DocumentType t : values()) {
            if (t.id == id) return t;
        }
        throw new IllegalArgumentException("Unknown DocumentType id: " + id);
    }

    public static DocumentType fromCode(String code) {
        if (code == null) return null;
        String normalized = code.trim().toUpperCase();
        for (DocumentType t : values()) {
            if (t.code.equalsIgnoreCase(normalized) || t.name().equalsIgnoreCase(normalized)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown DocumentType code: " + code);
    }
}
