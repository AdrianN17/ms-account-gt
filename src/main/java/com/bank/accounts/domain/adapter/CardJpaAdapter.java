package com.bank.accounts.domain.adapter;

import com.bank.accounts.domain.entities.Card;
import reactor.core.publisher.Mono;

public interface CardJpaAdapter {
    Mono<Boolean> createCard(Card card, Long accountId);

    Mono<Boolean> deleteCard(Long cardId);

    Mono<Card> obtainCard(Long cardId);

    Mono<Boolean> updateCard(Long cardId,
                                Card card, Long accountId);
}
