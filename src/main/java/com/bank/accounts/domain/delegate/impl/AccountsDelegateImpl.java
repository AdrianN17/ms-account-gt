package com.bank.accounts.domain.delegate.impl;

import com.bank.accounts.domain.delegate.AccountsDelegate;
import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.application.schemas.request.CreateAccountCardRequest;
import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Mono;

public class AccountsDelegateImpl implements AccountsDelegate {


    @Override
    public Mono<TrackingResponse> createAccount(Mono<AccountRequest> accountRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> createAccountCard(Long accountId, Mono<CreateAccountCardRequest> createAccountCardRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteAccount(Long accountId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteAccountCard(Long accountId, Long cardId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> editAccountCard(Long accountId, Long cardId, Mono<CreateAccountCardRequest> createAccountCardRequest) {
        return null;
    }

    @Override
    public Mono<AccountResponse> obtainAccount(Long accountId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> updateAccount(Long accountId, Mono<AccountRequest> accountRequest) {
        return null;
    }
}
