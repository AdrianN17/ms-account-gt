package com.bank.accounts.domain.service;

import com.bank.accounts.application.schemas.request.TransactionRequest;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.application.schemas.response.TransactionResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface TransactionService {
    Mono<TrackingResponse> createTransaction(Mono<TransactionRequest> transactionRequest);

    Mono<TrackingResponse> deleteTransaction(Long transactionId);

    Flux<TransactionResponse> obtainTransactionAccount(Long accountId, LocalDate dateMin, LocalDate dateMax);

    Mono<TrackingResponse> updateTransaction(Long transactionId, Mono<TransactionRequest> transactionRequest);
}
