package com.bank.accounts.domain.service.impl;

import com.bank.accounts.application.mapper.entity.AccountEntityMapper;
import com.bank.accounts.application.mapper.schemas.AccountMapper;
import com.bank.accounts.application.mapper.schemas.CardMapper;
import com.bank.accounts.application.mapper.schemas.TrackingMapper;
import com.bank.accounts.application.schemas.request.AccountRequest;
import com.bank.accounts.application.schemas.request.CreateAccountCardRequest;
import com.bank.accounts.application.schemas.response.AccountResponse;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.domain.adapter.AccountJpaAdapter;
import com.bank.accounts.domain.adapter.CardJpaAdapter;
import com.bank.accounts.domain.adapter.CreditAccountJpaAdapter;
import com.bank.accounts.domain.adapter.DebitAccountJpaAdapter;
import com.bank.accounts.domain.entities.Account;
import com.bank.accounts.domain.entities.Card;
import com.bank.accounts.domain.entities.CreditAccount;
import com.bank.accounts.domain.entities.DebitAccount;
import com.bank.accounts.domain.generic.GenericService;
import com.bank.accounts.domain.service.AccountService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountJpaAdapter accountJpaAdapter;

    private final GenericService<Account, Long, AccountJpaAdapter> genericServiceAccount;

    private final CardJpaAdapter cardJpaAdapter;
    private final GenericService<Card, Long, CardJpaAdapter> genericServiceCard;

    private final CreditAccountJpaAdapter creditAccountJpaAdapter;
    private final GenericService<CreditAccount, Long, CreditAccountJpaAdapter> genericServiceCreditAccount;

    private final DebitAccountJpaAdapter debitAccountJpaAdapter;
    private final GenericService<DebitAccount, Long, DebitAccountJpaAdapter> genericServiceDebitAccount;


    @Override
    public Mono<TrackingResponse> createAccount(Mono<AccountRequest> accountRequest) {
        return accountRequest.map(AccountMapper.INSTANCE::toRequestDto)
                .map(AccountEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(account ->
                        genericServiceAccount.create(Mono.just(account), accountJpaAdapter::createAccount))
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> createAccountCard(Long accountId,
                                                    Mono<CreateAccountCardRequest> createAccountCardRequest) {
        /*return createAccountCardRequest.flatMap(createAccountCardRequest1 -> {
            Mono.zip(Mono.just(createAccountCardRequest1.getCard()).map(CardMapper.Instance::toRequestDto))

        });*/
        return null;
    }

    @Override
    public Mono<TrackingResponse> deleteAccount(Long accountId) {
        return genericServiceAccount
                .delete(accountId, accountJpaAdapter::deleteAccount)
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> deleteAccountCard(Long accountId, Long cardId) {
        return null;
    }

    @Override
    public Mono<TrackingResponse> editAccountCard(Long accountId, Long cardId,
                                                  Mono<CreateAccountCardRequest> createAccountCardRequest) {
        return null;
    }

    @Override
    public Mono<AccountResponse> obtainAccount(Long accountId) {
        return accountJpaAdapter.obtainAccount(accountId)
                .map(AccountEntityMapper.INSTANCE::entityToResponseDto)
                .map(AccountMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> updateAccount(Long accountId,
                                                Mono<AccountRequest> accountRequest) {
        return accountRequest.map(AccountMapper.INSTANCE::toRequestDto)
                .map(AccountEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(account ->
                        genericServiceAccount.update(accountId, Mono.just(account), accountJpaAdapter::updateAccount))
                .map(TrackingMapper.INSTANCE::toResponse);
    }
}
