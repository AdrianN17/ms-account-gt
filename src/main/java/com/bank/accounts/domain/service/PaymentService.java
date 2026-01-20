package com.bank.accounts.domain.service;

import com.bank.accounts.application.schemas.request.PaymentRequest;
import com.bank.accounts.application.schemas.response.PaymentResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface PaymentService {

    Mono<TrackingResponse> createPayment(Mono<PaymentRequest> paymentRequest);

    Mono<TrackingResponse> deletePayment(Long paymentId);

    Mono<TrackingResponse> editPayment(Long paymentId, Mono<PaymentRequest> paymentRequest);

    Flux<PaymentResponse> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax);
}
