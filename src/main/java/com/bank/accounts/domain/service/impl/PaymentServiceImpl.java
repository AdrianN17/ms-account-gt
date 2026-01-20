package com.bank.accounts.domain.service.impl;

import com.bank.accounts.application.mapper.entity.PaymentEntityMapper;
import com.bank.accounts.application.mapper.schemas.PaymentMapper;
import com.bank.accounts.application.mapper.schemas.TrackingMapper;
import com.bank.accounts.application.schemas.request.PaymentRequest;
import com.bank.accounts.application.schemas.response.PaymentResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.domain.adapter.PaymentJpaAdapter;
import com.bank.accounts.domain.entities.Payment;
import com.bank.accounts.domain.generic.GenericService;
import com.bank.accounts.domain.service.PaymentService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentJpaAdapter paymentJpaAdapter;

    private final GenericService<Payment, Long, PaymentJpaAdapter> genericService;

    @Override
    public Mono<TrackingResponse> createPayment(Mono<PaymentRequest> paymentRequest) {
        return paymentRequest.map(PaymentMapper.INSTANCE::toRequestDto)
                .map(PaymentEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(payment ->
                        genericService.create(Mono.just(payment), paymentJpaAdapter::createPayment))
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> deletePayment(Long paymentId) {
        return genericService
                .delete(paymentId, paymentJpaAdapter::deletePayment)
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> editPayment(Long paymentId, Mono<PaymentRequest> paymentRequest) {
        return paymentRequest.map(PaymentMapper.INSTANCE::toRequestDto)
                .map(PaymentEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(payment ->
                        genericService.update(paymentId, Mono.just(payment), paymentJpaAdapter::editPayment))
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Flux<PaymentResponse> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return paymentJpaAdapter.obtainPaymentAccount(accountId, dateMin, dateMax)
                .map(PaymentEntityMapper.INSTANCE::entityToResponseDto)
                .map(PaymentMapper.INSTANCE::toResponse);
    }
}
