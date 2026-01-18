package com.bank.accounts.application.mapper.entity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.TransactionRequestDto;
import com.bank.accounts.domain.dto.response.TransactionResponseDto;
import com.bank.accounts.domain.entities.Transaction;

@Mapper(uses = {com.bank.accounts.application.util.EntityMapperHelper.class})
public interface TransactionEntityMapper {
    TransactionEntityMapper INSTANCE = Mappers.getMapper(TransactionEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "typeTransaction", target = "typeTransaction", qualifiedByName = "stringToInteger"),
            @Mapping(source = "amount", target = "amount", qualifiedByName = "stringToBigDecimal"),
            @Mapping(source = "currency", target = "currency", qualifiedByName = "stringToInteger")
    })
    Transaction requestDtoToEntity(TransactionRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "transactionId"),
            @Mapping(source = "typeTransaction", target = "typeTransaction", qualifiedByName = "integerToString"),
            @Mapping(source = "amount", target = "amount", qualifiedByName = "bigDecimalToString"),
            @Mapping(source = "currency", target = "currency", qualifiedByName = "integerToString")
    })
    TransactionResponseDto entityToResponseDto(Transaction in);
}
