package com.bank.accounts.domain.service.impl;

import com.bank.accounts.application.mapper.entity.TransactionEntityMapper;
import com.bank.accounts.application.mapper.schemas.TrackingMapper;
import com.bank.accounts.application.mapper.schemas.TransactionMapper;
import com.bank.accounts.application.schemas.request.TransactionRequest;
import com.bank.accounts.application.schemas.response.TrackingResponse;
import com.bank.accounts.application.schemas.response.TransactionResponse;
import com.bank.accounts.domain.adapter.TransactionJpaAdapter;
import com.bank.accounts.domain.entities.Transaction;
import com.bank.accounts.domain.generic.GenericService;
import com.bank.accounts.domain.service.TransactionService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionJpaAdapter transactionJpaAdapter;

    private final GenericService<Transaction, Long, TransactionJpaAdapter> genericService;

    @Override
    public Mono<TrackingResponse> createTransaction(Mono<TransactionRequest> transactionRequest) {
        return transactionRequest.map(TransactionMapper.INSTANCE::toRequestDto)
                .map(TransactionEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(transaction ->
                        genericService.create(Mono.just(transaction), transactionJpaAdapter::createTransaction))
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> deleteTransaction(Long transactionId) {
        return genericService
                .delete(transactionId, transactionJpaAdapter::deleteTransaction)
                .map(TrackingMapper.INSTANCE::toResponse);
    }

    @Override
    public Flux<TransactionResponse> obtainTransactionAccount(Long accountId, LocalDate dateMin, LocalDate dateMax) {
        return transactionJpaAdapter.obtainTransactionAccount(accountId, dateMin, dateMax)
                .map(TransactionEntityMapper.INSTANCE::entityToResponseDto)
                .map(TransactionMapper.INSTANCE::toResponse);
    }

    @Override
    public Mono<TrackingResponse> updateTransaction(Long transactionId, Mono<TransactionRequest> transactionRequest) {
        return transactionRequest.map(TransactionMapper.INSTANCE::toRequestDto)
                .map(TransactionEntityMapper.INSTANCE::requestDtoToEntity)
                .flatMap(transaction ->
                        genericService.update(transactionId, Mono.just(transaction), transactionJpaAdapter::updateTransaction))
                .map(TrackingMapper.INSTANCE::toResponse);
    }
}
