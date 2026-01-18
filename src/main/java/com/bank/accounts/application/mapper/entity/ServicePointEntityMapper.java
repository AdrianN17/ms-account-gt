package com.bank.accounts.application.mapper.entity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.bank.accounts.domain.dto.request.ServicePointRequestDto;
import com.bank.accounts.domain.dto.response.ServicePointResponseDto;
import com.bank.accounts.domain.entities.ServicePoint;

@Mapper(uses = {com.bank.accounts.application.util.EntityMapperHelper.class})
public interface ServicePointEntityMapper {
    ServicePointEntityMapper INSTANCE = Mappers.getMapper(ServicePointEntityMapper.class);

    ServicePoint requestDtoToEntity(ServicePointRequestDto in);

    @Mappings({
            @Mapping(source = "id", target = "servicePointId"),
            @Mapping(target = "accountOwner", ignore = true)
    })
    ServicePointResponseDto entityToResponseDto(ServicePoint in);
}
