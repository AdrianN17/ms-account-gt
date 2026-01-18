package com.bank.accounts.domain.delegate;

import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.application.schemas.request.CreateAccountCardRequest;
import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import reactor.core.publisher.Mono;

public interface AccountsDelegate {
    Mono<TrackingResponse> createAccount(Mono<AccountRequest> accountRequest);

    Mono<TrackingResponse> createAccountCard(Long accountId, Mono<CreateAccountCardRequest> createAccountCardRequest);

    Mono<TrackingResponse> deleteAccount(Long accountId);

    Mono<TrackingResponse> deleteAccountCard(Long accountId, Long cardId);

    Mono<TrackingResponse> editAccountCard(Long accountId, Long cardId, Mono<CreateAccountCardRequest> createAccountCardRequest);

    Mono<AccountResponse> obtainAccount(Long accountId);

    Mono<TrackingResponse> updateAccount(Long accountId, Mono<AccountRequest> accountRequest);
}
