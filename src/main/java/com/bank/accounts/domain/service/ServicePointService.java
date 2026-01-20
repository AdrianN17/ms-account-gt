package com.bank.accounts.domain.service;

import com.bank.accounts.application.schemas.request.ServicePointRequest;
import com.bank.accounts.application.schemas.response.ServicePointResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServicePointService {
    Mono<TrackingResponse> createServicePoint(Long accountId, Mono<ServicePointRequest> servicePointRequest);

    Mono<TrackingResponse> deleteServicePoint(Long servicePointId, Long accountId);

    Mono<TrackingResponse> editServicePoint(Long servicePointId, Long accountId, Mono<ServicePointRequest> servicePointRequest);

    Mono<ServicePointResponse> obtainServicePoint(Long servicePointId);

    Flux<ServicePointResponse> obtainServicePointOwner(Long servicePointId, Long accountId);
}
