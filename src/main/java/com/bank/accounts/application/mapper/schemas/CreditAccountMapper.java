package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.CreditAccountRequest;
import com.bank.accounts.domain.dto.request.CreditAccountRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.CreditAccountResponse;
import com.bank.accounts.domain.dto.response.CreditAccountResponseDto;

@Mapper
public interface CreditAccountMapper {
    CreditAccountMapper INSTANCE = Mappers.getMapper(CreditAccountMapper.class);

    CreditAccountResponse toResponse(CreditAccountResponseDto in);
    CreditAccountRequestDto toRequestDto(CreditAccountRequest in);
}

