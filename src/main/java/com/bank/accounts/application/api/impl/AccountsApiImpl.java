package com.bank.accounts.application.api.impl;

import com.bank.accounts.application.api.AccountsApi;
import com.bank.accounts.domain.delegate.AccountsDelegate;
import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.application.schemas.request.CreateAccountCardRequest;
import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AccountsApiImpl implements AccountsApi {

    private final AccountsDelegate accountsDelegate;

    @Override
    public Mono<TrackingResponse> createAccount(Mono<AccountRequest> accountRequest, ServerWebExchange exchange) {
        return accountsDelegate.createAccount(accountRequest);
    }

    @Override
    public Mono<TrackingResponse> createAccountCard(Long accountId, Mono<CreateAccountCardRequest> createAccountCardRequest, ServerWebExchange exchange) {
        return accountsDelegate.createAccountCard(accountId, createAccountCardRequest);
    }

    @Override
    public Mono<TrackingResponse> deleteAccount(Long accountId, ServerWebExchange exchange) {
        return accountsDelegate.deleteAccount(accountId);
    }

    @Override
    public Mono<TrackingResponse> deleteAccountCard(Long accountId, Long cardId, ServerWebExchange exchange) {
        return accountsDelegate.deleteAccountCard(accountId, cardId);
    }

    @Override
    public Mono<TrackingResponse> editAccountCard(Long accountId, Long cardId, Mono<CreateAccountCardRequest> createAccountCardRequest, ServerWebExchange exchange) {
        return accountsDelegate.editAccountCard(accountId, cardId, createAccountCardRequest);
    }

    @Override
    public Mono<AccountResponse> obtainAccount(Long accountId, ServerWebExchange exchange) {
        return accountsDelegate.obtainAccount(accountId);
    }

    @Override
    public Mono<TrackingResponse> updateAccount(Long accountId, Mono<AccountRequest> accountRequest, ServerWebExchange exchange) {
        return accountsDelegate.updateAccount(accountId, accountRequest);
    }
}
