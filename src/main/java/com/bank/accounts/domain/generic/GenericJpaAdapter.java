package com.bank.accounts.domain.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Objects;

public class GenericJpaAdapter<T, ID, R extends JpaRepository<T, ID>> {

    private final R repository;

    public GenericJpaAdapter(R repository) {
        this.repository = Objects.requireNonNull(repository, "repository is required");
    }

    public Mono<Boolean> create(T t) {
        return Mono.fromCallable(() -> repository.save(t))
                .map(obj -> true)
                .onErrorReturn(false)
                .subscribeOn(Schedulers.boundedElastic());
    }

    public Mono<Boolean> delete(ID id) {
        return Mono.fromCallable(() -> repository.findById(id))
                .flatMap(Mono::justOrEmpty)
                .flatMap(existing -> Mono.fromRunnable(() -> repository.delete(existing)).thenReturn(true))
                .defaultIfEmpty(false)
                .onErrorReturn(false)
                .subscribeOn(Schedulers.boundedElastic());
    }


    public Mono<T> obtain(ID id) {
        return Mono.fromCallable(() -> repository.findById(id))
                .flatMap(Mono::justOrEmpty)
                .subscribeOn(Schedulers.boundedElastic());
    }

    public Mono<Boolean> update(T t) {
        return Mono.fromCallable(() -> repository.save(t))
                .map(obj -> true)
                .onErrorReturn(false)
                .subscribeOn(Schedulers.boundedElastic());
    }
}
