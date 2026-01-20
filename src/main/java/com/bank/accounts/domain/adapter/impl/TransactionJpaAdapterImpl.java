package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.TransactionJpaAdapter;
import com.bank.accounts.domain.entities.Transaction;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class TransactionJpaAdapterImpl implements TransactionJpaAdapter {

    private final GenericJpaAdapter<Transaction, Long, TransactionRepository> delegate;
    private final TransactionRepository transactionRepository;

    @Override
    public Mono<Boolean> createTransaction(Transaction transaction) {
        return delegate.create(transaction);
    }

    @Override
    public Mono<Boolean> deleteTransaction(Long transactionId) {
        return delegate.delete(transactionId);
    }

    @Override
    public Flux<Transaction> obtainTransactionAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return null;
    }

    @Override
    public Mono<Boolean> updateTransaction(Long transactionId, Transaction transaction) {
        transaction.setId(transactionId);
        return delegate.create(transaction);
    }
}
