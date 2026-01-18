package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.CardRequest;
import com.bank.accounts.application.schemas.response.CardResponse;
import com.bank.accounts.domain.dto.request.CardRequestDto;
import com.bank.accounts.domain.dto.response.CardResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {com.bank.accounts.application.mapper.schemas.CardCreditDebitAccountMapper.class})
public interface CardMapper {
    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

    CardResponse toResponse(CardResponseDto in);
    CardRequestDto toRequestDto(CardRequest in);
}
