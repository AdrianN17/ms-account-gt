package com.bank.accounts.application.api.impl;

import com.bank.accounts.application.api.PaymentsApi;
import com.bank.accounts.domain.delegate.PaymentsDelegate;
import com.bank.accounts.application.schemas.request.PaymentRequest;
import com.bank.accounts.application.schemas.response.PaymentResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class PaymentsApiImpl implements PaymentsApi {

    private final PaymentsDelegate paymentsDelegate;

    @Override
    public Mono<TrackingResponse> createPayment(Mono<PaymentRequest> paymentRequest, ServerWebExchange exchange) {
        return paymentsDelegate.createPayment(paymentRequest);
    }

    @Override
    public Mono<TrackingResponse> deletePayment(Long paymentId, ServerWebExchange exchange) {
        return paymentsDelegate.deletePayment(paymentId);
    }

    @Override
    public Mono<TrackingResponse> editPayment(Long paymentId, Mono<PaymentRequest> paymentRequest, ServerWebExchange exchange) {
        return paymentsDelegate.editPayment(paymentId, paymentRequest);
    }

    @Override
    public Flux<PaymentResponse> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax, ServerWebExchange exchange) {
        return paymentsDelegate.obtainPaymentAccount(accountId, dateMin, dateMax);
    }
}
