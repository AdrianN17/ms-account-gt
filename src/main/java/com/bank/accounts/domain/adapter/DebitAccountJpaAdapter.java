package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.DebitAccount;
import reactor.core.publisher.Mono;

public interface DebitAccountJpaAdapter {
    Mono<Boolean> createDebitAccount(DebitAccount debitAccount);

    Mono<Boolean> deleteDebitAccount(Long debitAccountId);

    Mono<DebitAccount> obtainDebitAccount(Long debitAccountId);

    Mono<Boolean> updateDebitAccount(Long debitAccountId,
                                     DebitAccount debitAccount);
}
