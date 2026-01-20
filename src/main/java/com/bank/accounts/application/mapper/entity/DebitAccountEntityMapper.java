package com.bank.accounts.application.mapper.entity;

import com.bank.accounts.application.util.EntityMapperHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.DebitAccountRequestDto;
import com.bank.accounts.domain.dto.response.DebitAccountResponseDto;
import com.bank.accounts.domain.entities.DebitAccount;

@Mapper(uses = {EntityMapperHelper.class}, builder = @org.mapstruct.Builder(disableBuilder = true))
public interface DebitAccountEntityMapper {
    DebitAccountEntityMapper INSTANCE = Mappers.getMapper(DebitAccountEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "card", ignore = true)
    })
    DebitAccount requestDtoToEntity(DebitAccountRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "debitAccountId"),
            @Mapping(source = "card.id", target = "cardId")
    })
    DebitAccountResponseDto entityToResponseDto(DebitAccount in);
}
