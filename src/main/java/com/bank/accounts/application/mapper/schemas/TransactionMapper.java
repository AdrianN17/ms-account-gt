package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.TransactionRequest;
import com.bank.accounts.application.schemas.response.TransactionResponse;
import com.bank.accounts.domain.dto.request.TransactionRequestDto;
import com.bank.accounts.domain.dto.response.TransactionResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    TransactionResponse toResponse(TransactionResponseDto in);

    TransactionRequestDto toRequestDto(TransactionRequest in);
}

