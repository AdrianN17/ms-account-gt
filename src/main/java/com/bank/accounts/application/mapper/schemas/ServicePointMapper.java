package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.request.ServicePointRequest;
import com.bank.accounts.domain.dto.request.ServicePointRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.application.schemas.response.ServicePointResponse;
import com.bank.accounts.domain.dto.response.ServicePointResponseDto;

@Mapper(uses = {AccountMapper.class})
public interface ServicePointMapper {
    ServicePointMapper INSTANCE = Mappers.getMapper(ServicePointMapper.class);

    ServicePointResponse toResponse(ServicePointResponseDto in);
    ServicePointRequestDto toRequestDto(ServicePointRequest in);
}
