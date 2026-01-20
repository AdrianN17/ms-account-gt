package com.bank.accounts.application.mapper.entity;

import com.bank.accounts.application.util.EntityMapperHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.CreditAccountRequestDto;
import com.bank.accounts.domain.dto.response.CreditAccountResponseDto;
import com.bank.accounts.domain.entities.CreditAccount;

@Mapper(uses = {EntityMapperHelper.class}, builder = @org.mapstruct.Builder(disableBuilder = true))
public interface CreditAccountEntityMapper {
    CreditAccountEntityMapper INSTANCE = Mappers.getMapper(CreditAccountEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "cardId", ignore = true),
            @Mapping(target = "card", ignore = true),
            @Mapping(target = "maxAmount", source = "maxAccount")
    })
    CreditAccount requestDtoToEntity(CreditAccountRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "creditAccountId"),
            @Mapping(source = "maxAmount", target = "maxAccount")
    })
    CreditAccountResponseDto entityToResponseDto(CreditAccount in);
}
