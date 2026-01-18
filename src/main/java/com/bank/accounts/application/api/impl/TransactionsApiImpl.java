package com.bank.accounts.application.api.impl;

import com.bank.accounts.application.api.TransactionsApi;
import com.bank.accounts.domain.delegate.TransactionsDelegate;
import com.bank.accounts.application.schemas.request.TransactionRequest;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.application.schemas.response.TransactionResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class TransactionsApiImpl implements TransactionsApi {

    private final TransactionsDelegate transactionsDelegate;

    @Override
    public Mono<TrackingResponse> createTransaction(Mono<TransactionRequest> transactionRequest, ServerWebExchange exchange) {
        return transactionsDelegate.createTransaction(transactionRequest);
    }

    @Override
    public Mono<TrackingResponse> deleteTransaction(Long transactionId, ServerWebExchange exchange) {
        return transactionsDelegate.deleteTransaction(transactionId);
    }

    @Override
    public Flux<TransactionResponse> obtainTransactionAccount(Long accountId, LocalDate dateMin, LocalDate dateMax, ServerWebExchange exchange) {
        return transactionsDelegate.obtainTransactionAccount(accountId, dateMin, dateMax);
    }

    @Override
    public Mono<TrackingResponse> updateTransaction(Long transactionId, Mono<TransactionRequest> transactionRequest, ServerWebExchange exchange) {
        return transactionsDelegate.updateTransaction(transactionId, transactionRequest);
    }
}
