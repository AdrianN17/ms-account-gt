package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.ServicePointJpaAdapter;
import com.bank.accounts.domain.entities.ServicePoint;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.ServicePointRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ServicePointJpaAdapterImpl implements ServicePointJpaAdapter {

    private final GenericJpaAdapter<ServicePoint, Long, ServicePointRepository> delegate;

    @Override
    public Mono<Boolean> createServicePoint(ServicePoint servicePoint) {
        return delegate.create(servicePoint);
    }

    @Override
    public Mono<Boolean> deleteServicePoint(Long servicePointId) {
        return delegate.delete(servicePointId);
    }

    @Override
    public Mono<Boolean> editServicePoint(Long servicePointId, ServicePoint servicePoint) {
        servicePoint.setId(servicePointId);
        return delegate.update(servicePoint);
    }

    @Override
    public Mono<ServicePoint> obtainServicePoint(Long servicePointId) {
        return delegate.obtain(servicePointId);
    }

    @Override
    public Flux<ServicePoint> obtainServicePointOwner(Long servicePointId, Long accountId) {
        return null;
    }
}
