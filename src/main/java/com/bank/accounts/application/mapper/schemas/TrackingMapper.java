package com.bank.accounts.application.mapper.schemas;

import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.domain.dto.response.TrackingResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrackingMapper {

    TrackingMapper INSTANCE = Mappers.getMapper(TrackingMapper.class);

    TrackingResponse toResponse(TrackingResponseDto in);
}
