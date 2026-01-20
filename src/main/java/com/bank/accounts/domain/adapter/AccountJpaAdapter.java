package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.Account;
import reactor.core.publisher.Mono;

public interface AccountJpaAdapter {
    Mono<Boolean> createAccount(Account account);

    Mono<Boolean> deleteAccount(Long accountId);

    Mono<Account> obtainAccount(Long accountId);

    Mono<Boolean> updateAccount(Long accountId,
                                Account account);

}
