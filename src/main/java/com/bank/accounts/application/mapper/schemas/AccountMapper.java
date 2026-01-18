package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.domain.dto.request.AccountRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.domain.dto.response.AccountResponseDto;

@Mapper(uses = {CardMapper.class})
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountResponse toResponse(AccountResponseDto in);
    AccountRequestDto toRequestDto(AccountRequest in);
}
