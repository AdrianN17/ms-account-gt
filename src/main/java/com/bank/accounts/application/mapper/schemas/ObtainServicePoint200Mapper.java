package com.bank.accounts.application.mapper.schemas;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.ObtainServicePoint200Response;
import com.bank.accounts.domain.dto.response.ServicePointResponseDto;

@Mapper(uses = {AccountMapper.class})
public interface ObtainServicePoint200Mapper {
    ObtainServicePoint200Mapper INSTANCE = Mappers.getMapper(ObtainServicePoint200Mapper.class);

    ObtainServicePoint200Response toResponse(ServicePointResponseDto in);
}

