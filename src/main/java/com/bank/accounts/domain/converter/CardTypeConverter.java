package com.bank.accounts.domain.converter;

import com.bank.accounts.domain.entities.enums.CardType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CardTypeConverter implements AttributeConverter<CardType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(CardType attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public CardType convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : CardType.fromId(dbData);
    }
}

