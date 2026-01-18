package com.bank.accounts.application.mapper.entity;

import com.bank.accounts.application.util.EntityMapperHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.CardRequestDto;
import com.bank.accounts.domain.dto.response.CardResponseDto;
import com.bank.accounts.domain.entities.Card;

@Mapper(uses = {EntityMapperHelper.class})
public interface CardEntityMapper {
    CardEntityMapper INSTANCE = Mappers.getMapper(CardEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "account", ignore = true),
            @Mapping(target = "creditAccount", ignore = true),
            @Mapping(target = "debitAccount", ignore = true)
    })
    Card requestDtoToEntity(CardRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "cardId"),
            @Mapping(source = "account.id", target = "accountId"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "cardType", target = "cardType"),
            @Mapping(target = "creditDebitAccount", ignore = true)
    })
    CardResponseDto entityToResponseDto(Card in);
}
