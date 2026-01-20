package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.AccountJpaAdapter;
import com.bank.accounts.domain.entities.Account;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.AccountRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AccountJpaAdapterImpl implements AccountJpaAdapter {

    private final GenericJpaAdapter<Account, Long, AccountRepository> delegate;

    @Override
    public Mono<Boolean> createAccount(Account account) {
        return delegate.create(account);
    }

    @Override
    public Mono<Boolean> deleteAccount(Long accountId) {
        return delegate.delete(accountId);
    }

    @Override
    public Mono<Account> obtainAccount(Long accountId) {
        return delegate.obtain(accountId);
    }

    @Override
    public Mono<Boolean> updateAccount(Long accountId, Account account) {
        account.setId(accountId);
        return delegate.update(account);
    }
}
