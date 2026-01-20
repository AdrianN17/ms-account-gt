package com.bank.accounts.domain.service.impl;

import com.bank.accounts.application.mapper.entity.ServicePointEntityMapper;
import com.bank.accounts.application.mapper.schemas.ServicePointMapper;
import com.bank.accounts.application.mapper.schemas.TrackingMapper;
import com.bank.accounts.application.schemas.request.ServicePointRequest;
import com.bank.accounts.application.schemas.response.ServicePointResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.domain.adapter.ServicePointJpaAdapter;
import com.bank.accounts.domain.entities.ServicePoint;
import com.bank.accounts.domain.generic.GenericService;
import com.bank.accounts.domain.service.ServicePointService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ServicePointServiceImpl implements ServicePointService {

    private final ServicePointJpaAdapter servicePointJpaAdapter;

    private final GenericService<ServicePoint, Long, ServicePointJpaAdapter> genericService;

    @Override
    public Mono<TrackingResponse> createServicePoint(Long accountId, Mono<ServicePointRequest> servicePointRequest) {

        return servicePointRequest.map(ServicePointMapper.INSTANCE::toRequestDto)
                .map(ServicePointEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(servicePoint ->
                {
                    servicePoint.setDebitAccountId(accountId);
                    return genericService.create(Mono.just(servicePoint), servicePointJpaAdapter::createServicePoint);
                })
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> deleteServicePoint(Long servicePointId, Long accountId) {
        return genericService
                .delete(servicePointId, servicePointJpaAdapter::deleteServicePoint)
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> editServicePoint(Long servicePointId, Long accountId, Mono<ServicePointRequest> servicePointRequest) {

        return servicePointRequest.map(ServicePointMapper.INSTANCE::toRequestDto)
                .map(ServicePointEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(servicePoint ->
                {
                    servicePoint.setDebitAccountId(accountId);
                    return genericService.update(servicePointId, Mono.just(servicePoint), servicePointJpaAdapter::editServicePoint);
                })
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<ServicePointResponse> obtainServicePoint(Long servicePointId) {
        return servicePointJpaAdapter.obtainServicePoint(servicePointId)
                .map(ServicePointEntityMapper.INSTANCE::entityToResponseDto)
                .map(ServicePointMapper.INSTANCE::toResponse);
    }

    @Override
    public Flux<ServicePointResponse> obtainServicePointOwner(Long servicePointId, Long accountId) {
        return servicePointJpaAdapter.obtainServicePointOwner(accountId, accountId)
                .map(ServicePointEntityMapper.INSTANCE::entityToResponseDto)
                .map(ServicePointMapper.INSTANCE::toResponse);
    }
}
