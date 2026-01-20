package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.DebitAccountJpaAdapter;
import com.bank.accounts.domain.entities.DebitAccount;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.DebitAccountRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class DebitAccountJpaAdapterImpl implements DebitAccountJpaAdapter {

    private final GenericJpaAdapter<DebitAccount, Long, DebitAccountRepository> delegate;

    @Override
    public Mono<Boolean> createDebitAccount(DebitAccount debitAccount) {
        return delegate.create(debitAccount);
    }

    @Override
    public Mono<Boolean> deleteDebitAccount(Long debitAccountId) {
        return delegate.delete(debitAccountId);
    }

    @Override
    public Mono<DebitAccount> obtainDebitAccount(Long debitAccountId) {
        return delegate.obtain(debitAccountId);
    }

    @Override
    public Mono<Boolean> updateDebitAccount(Long debitAccountId, DebitAccount debitAccount) {
        debitAccount.setId(debitAccountId);
        return delegate.update(debitAccount);
    }
}
