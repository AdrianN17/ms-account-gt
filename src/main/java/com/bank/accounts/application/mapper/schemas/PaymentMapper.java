package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.PaymentRequest;
import com.bank.accounts.domain.dto.request.PaymentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.PaymentResponse;
import com.bank.accounts.domain.dto.response.PaymentResponseDto;

@Mapper
public interface PaymentMapper {
    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    PaymentResponse toResponse(PaymentResponseDto in);
    PaymentRequestDto toRequestDto(PaymentRequest in);
}

