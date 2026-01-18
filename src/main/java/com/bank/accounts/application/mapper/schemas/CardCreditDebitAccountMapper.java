package com.bank.accounts.application.mapper.schemas;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.CardResponseCreditDebitAccount;
import com.bank.accounts.domain.dto.response.CardResponseCreditDebitAccountDto;

@Mapper
public interface CardCreditDebitAccountMapper {
    CardCreditDebitAccountMapper INSTANCE = Mappers.getMapper(CardCreditDebitAccountMapper.class);

    CardResponseCreditDebitAccount toResponse(CardResponseCreditDebitAccountDto in);
}

