package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.PaymentJpaAdapter;
import com.bank.accounts.domain.entities.Payment;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class PaymentJpaAdapterImpl implements PaymentJpaAdapter {

    private final GenericJpaAdapter<Payment, Long, PaymentRepository> delegate;
    PaymentRepository paymentRepository;

    @Override
    public Mono<Boolean> createPayment(Payment payment) {
        return delegate.create(payment);
    }

    @Override
    public Mono<Boolean> deletePayment(Long paymentId) {
        return delegate.delete(paymentId);
    }

    @Override
    public Mono<Boolean> editPayment(Long paymentId, Payment payment) {
        payment.setId(paymentId);
        return delegate.update(payment);
    }

    @Override
    public Flux<Payment> obtainPaymentAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return null;
    }
}
