package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.ServicePoint;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServicePointJpaAdapter {
    Mono<Boolean> createServicePoint(ServicePoint servicePoint);

    Mono<Boolean> deleteServicePoint(Long servicePointId);

    Mono<Boolean> editServicePoint(Long servicePointId, ServicePoint servicePoint);

    Mono<ServicePoint> obtainServicePoint(Long servicePointId);

    Flux<ServicePoint> obtainServicePointOwner(Long servicePointId, Long accountId);
}
