package com.bank.accounts.application.util;

import com.bank.accounts.domain.dto.response.TrackingResponseDto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TrackingResponseDtoData {
    public static TrackingResponseDto createTrackingDto()
    {
        return TrackingResponseDto.builder()
                .trackingId(UUID.randomUUID())
                .operationDate(OffsetDateTime.now())
                .build();
    }
}
