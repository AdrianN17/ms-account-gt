package com.bank.accounts.domain.converter;

import com.bank.accounts.domain.entities.enums.DocumentType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DocumentTypeConverter implements AttributeConverter<DocumentType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DocumentType attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public DocumentType convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : DocumentType.fromId(dbData);
    }
}

