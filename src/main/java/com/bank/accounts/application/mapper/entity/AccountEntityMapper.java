package com.bank.accounts.application.mapper.entity;

import com.bank.accounts.application.util.EntityMapperHelper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.AccountRequestDto;
import com.bank.accounts.domain.dto.response.AccountResponseDto;
import com.bank.accounts.domain.entities.Account;

@Mapper(uses = {EntityMapperHelper.class, CardEntityMapper.class})
public interface AccountEntityMapper {
    AccountEntityMapper INSTANCE = Mappers.getMapper(AccountEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "cards", ignore = true)
    })
    Account requestDtoToEntity(AccountRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "accountId"),
            @Mapping(source = "cards", target = "cards")
    })
    AccountResponseDto entityToResponseDto(Account in);
}
