package com.bank.accounts.application.mapper.entity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.PaymentRequestDto;
import com.bank.accounts.domain.dto.response.PaymentResponseDto;
import com.bank.accounts.domain.entities.Payment;

@Mapper(uses = {com.bank.accounts.application.util.EntityMapperHelper.class})
public interface PaymentEntityMapper {
    PaymentEntityMapper INSTANCE = Mappers.getMapper(PaymentEntityMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "typePayment", target = "typePayment", qualifiedByName = "stringToInteger"),
            @Mapping(source = "currency", target = "currency", qualifiedByName = "stringToInteger")
    })
    Payment requestDtoToEntity(PaymentRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "paymentId"),
            @Mapping(source = "typePayment", target = "typePayment", qualifiedByName = "integerToString"),
            @Mapping(source = "currency", target = "currency", qualifiedByName = "integerToString")
    })
    PaymentResponseDto entityToResponseDto(Payment in);
}
