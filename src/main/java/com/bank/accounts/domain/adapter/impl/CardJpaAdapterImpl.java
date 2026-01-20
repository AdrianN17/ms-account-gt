package com.bank.accounts.domain.adapter.impl;

import com.bank.accounts.domain.adapter.CardJpaAdapter;
import com.bank.accounts.domain.entities.Card;
import com.bank.accounts.domain.generic.GenericJpaAdapter;
import com.bank.accounts.domain.repository.CardRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CardJpaAdapterImpl implements CardJpaAdapter {

    private final GenericJpaAdapter<Card, Long, CardRepository> delegate;

    @Override
    public Mono<Boolean> createCard(Card card, Long accountId) {
        card.setAccountId(accountId);
        return delegate.create(card);
    }

    @Override
    public Mono<Boolean> deleteCard(Long cardId) {
        return delegate.delete(cardId);
    }

    @Override
    public Mono<Card> obtainCard(Long cardId) {
        return delegate.obtain(cardId);
    }

    @Override
    public Mono<Boolean> updateCard(Long cardId, Card card, Long accountId) {
        card.setId(cardId);
        return delegate.update(card);
    }
}
