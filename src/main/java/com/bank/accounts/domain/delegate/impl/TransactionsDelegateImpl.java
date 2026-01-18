package com.bank.accounts.domain.delegate.impl;

import com.bank.accounts.domain.delegate.TransactionsDelegate;
import com.bank.accounts.application.schemas.request.TransactionRequest;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.application.schemas.response.TransactionResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public class TransactionsDelegateImpl implements TransactionsDelegate {


    @Override
    public Mono<TrackingResponse> createTransaction(Mono<TransactionRequest> transactionRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteTransaction(Long transactionId) {
        return null;
    }

    @Override
    public Flux<TransactionResponse> obtainTransactionAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> updateTransaction(Long transactionId, Mono<TransactionRequest> transactionRequest) {
        return null;
    }
}
