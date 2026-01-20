package com.bank.accounts.domain.delegate.impl;

import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.application.schemas.request.CreateAccountCardRequest;
import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.domain.delegate.AccountsDelegate;
import com.bank.accounts.domain.service.AccountService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AccountsDelegateImpl implements AccountsDelegate {

    private final AccountService accountService;

    @Override
    public Mono<TrackingResponse> createAccount(Mono<AccountRequest> accountRequest) {
        return accountService.createAccount(accountRequest);
    }

    @Override
    public Mono<TrackingResponse> createAccountCard(Long accountId, Mono<CreateAccountCardRequest> createAccountCardRequest) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteAccount(Long accountId) {
        return accountService.deleteAccount(accountId);
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
        return accountService.obtainAccount(accountId);
    }

    @Override
    public Mono<TrackingResponse> updateAccount(Long accountId, Mono<AccountRequest> accountRequest) {
        return accountService.updateAccount(accountId, accountRequest);
    }
}
