package com.bank.accounts.application.api.impl;

import com.bank.accounts.application.api.ServicePointsApi;
import com.bank.accounts.domain.delegate.ServicePointsDelegate;
import com.bank.accounts.application.schemas.request.ServicePointRequest;
import com.bank.accounts.application.schemas.response.ServicePointResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ServicePointsApiImpl implements ServicePointsApi {

    private final ServicePointsDelegate servicePointsDelegate;

    @Override
    public Mono<TrackingResponse> createServicePoint(Long accountId, Mono<ServicePointRequest> servicePointRequest, ServerWebExchange exchange) {
        return servicePointsDelegate.createServicePoint(accountId, servicePointRequest);
    }

    @Override
    public Mono<TrackingResponse> deleteServicePoint(Long servicePointId, Long accountId, ServerWebExchange exchange) {
        return servicePointsDelegate.deleteServicePoint(servicePointId, accountId);
    }

    @Override
    public Mono<TrackingResponse> editServicePoint(Long servicePointId, Long accountId, Mono<ServicePointRequest> servicePointRequest, ServerWebExchange exchange) {
        return servicePointsDelegate.editServicePoint(servicePointId, accountId, servicePointRequest);
    }

    @Override
    public Mono<ServicePointResponse> obtainServicePoint(Long servicePointId, ServerWebExchange exchange) {
        return servicePointsDelegate.obtainServicePoint(servicePointId);
    }

    @Override
    public Flux<ServicePointResponse> obtainServicePointOwner(Long servicePointId, Long accountId, ServerWebExchange exchange) {
        return servicePointsDelegate.obtainServicePointOwner(servicePointId, accountId);
    }
}
