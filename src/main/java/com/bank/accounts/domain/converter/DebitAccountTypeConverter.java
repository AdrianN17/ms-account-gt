package com.bank.accounts.domain.converter;

import com.bank.accounts.domain.entities.enums.DebitAccountType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DebitAccountTypeConverter implements AttributeConverter<DebitAccountType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DebitAccountType attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public DebitAccountType convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : DebitAccountType.fromId(dbData);
    }
}

