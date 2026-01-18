package com.bank.accounts.domain.delegate.impl;

import com.bank.accounts.domain.delegate.ServicePointsDelegate;
import com.bank.accounts.application.schemas.request.ServicePointRequest;
import com.bank.accounts.application.schemas.response.ObtainServicePoint200Response;
import com.bank.accounts.application.schemas.response.ServicePointResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ServicePointsDelegateImpl implements ServicePointsDelegate {


    @Override
    public Mono<TrackingResponse> createServicePoint(Long accountId, Mono<ServicePointRequest> servicePointRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteServicePoint(Long servicePointId, Long accountId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> editServicePoint(Long servicePointId, Long accountId, Mono<ServicePointRequest> servicePointRequest) {
        return null;
    }

    @Override
    public Mono<ObtainServicePoint200Response> obtainServicePoint(Long servicePointId) {
        return null;
    }

    @Override
    public Flux<ServicePointResponse> obtainServicePointOwner(Long servicePointId, Long accountId) {
        return null;
    }
}
