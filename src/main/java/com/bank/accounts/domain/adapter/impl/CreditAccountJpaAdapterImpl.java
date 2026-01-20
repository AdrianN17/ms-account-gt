package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.CreditAccountJpaAdapter;
import com.bank.accounts.domain.entities.CreditAccount;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.CreditAccountRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CreditAccountJpaAdapterImpl implements CreditAccountJpaAdapter {

    private final GenericJpaAdapter<CreditAccount, Long, CreditAccountRepository> delegate;

    @Override
    public Mono<Boolean> createCreditAccount(CreditAccount creditAccount) {
        return delegate.create(creditAccount);
    }

    @Override
    public Mono<Boolean> deleteCreditAccount(Long creditAccountId) {
        return delegate.delete(creditAccountId);
    }

    @Override
    public Mono<CreditAccount> obtainCreditAccount(Long creditAccountId) {
        return delegate.obtain(creditAccountId);
    }

    @Override
    public Mono<Boolean> updateCreditAccount(Long creditAccountId, CreditAccount creditAccount) {
        creditAccount.setId(creditAccountId);
        return delegate.update(creditAccount);
    }
}
