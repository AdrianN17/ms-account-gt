package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.CreditAccount;
import reactor.core.publisher.Mono;

public interface CreditAccountJpaAdapter {
    Mono<Boolean> createCreditAccount(CreditAccount creditAccount);

    Mono<Boolean> deleteCreditAccount(Long creditAccountId);

    Mono<CreditAccount> obtainCreditAccount(Long creditAccountId);

    Mono<Boolean> updateCreditAccount(Long creditAccountId,
                                      CreditAccount creditAccount);
}
