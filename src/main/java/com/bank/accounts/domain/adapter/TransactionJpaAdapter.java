package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface TransactionJpaAdapter {
    Mono<Boolean> createTransaction(Transaction transaction);

    Mono<Boolean> deleteTransaction(Long transactionId);

    Flux<Transaction> obtainTransactionAccount(Long accountId,
                                               LocalDate dateMin,
                                               LocalDate dateMax);

    Mono<Boolean> updateTransaction(Long transactionId,
                                    Transaction transaction);
}
