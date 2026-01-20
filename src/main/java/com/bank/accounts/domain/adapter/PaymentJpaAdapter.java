package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.Payment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface PaymentJpaAdapter {
    Mono<Boolean> createPayment(Payment payment);

    Mono<Boolean> deletePayment(Long paymentId);

    Mono<Boolean> editPayment(Long paymentId, Payment paymentRequest);

    Flux<Payment> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax);
}
