package com.bank.accounts.domain.delegate.impl;

import com.bank.accounts.domain.delegate.PaymentsDelegate;
import com.bank.accounts.application.schemas.request.PaymentRequest;
import com.bank.accounts.application.schemas.response.PaymentResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public class PaymentsDelegateImpl implements PaymentsDelegate {

    @Override
    public Mono<TrackingResponse> createPayment(Mono<PaymentRequest> paymentRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deletePayment(Long paymentId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> editPayment(Long paymentId, Mono<PaymentRequest> paymentRequest) {
        return null;
    }

    @Override
    public Flux<PaymentResponse> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return null;
    }
}
