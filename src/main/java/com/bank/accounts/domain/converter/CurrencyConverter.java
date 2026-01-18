package com.bank.accounts.domain.converter;

import com.bank.accounts.domain.entities.enums.Currency;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyConverter implements AttributeConverter<Currency, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Currency attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public Currency convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : Currency.fromId(dbData);
    }
}

