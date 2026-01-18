package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.DebitAccountRequest;
import com.bank.accounts.domain.dto.request.DebitAccountRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.DebitAccountResponse;
import com.bank.accounts.domain.dto.response.DebitAccountResponseDto;

@Mapper
public interface DebitAccountMapper {
    DebitAccountMapper INSTANCE = Mappers.getMapper(DebitAccountMapper.class);

    DebitAccountResponse toResponse(DebitAccountResponseDto in);
    DebitAccountRequestDto toRequestDto(DebitAccountRequest in);
}

