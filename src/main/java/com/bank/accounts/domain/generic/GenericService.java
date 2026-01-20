package com.bank.accounts.domain.generic;

import com.bank.accounts.application.util.TrackingResponseDtoData;
import com.bank.accounts.domain.dto.response.TrackingResponseDto;
import reactor.core.publisher.Mono;

import java.util.function.BiFunction;
import java.util.function.Function;

public class GenericService<EN, ID, MA> {

    public Mono<TrackingResponseDto> create(Mono<EN> reMono,
                                            Function<EN, Mono<Boolean>> createFn) {
        return reMono
                .flatMap(createFn)
                .flatMap(created -> created
                        ? Mono.just(TrackingResponseDtoData.createTrackingDto())
                        : Mono.empty());
    }

    public Mono<TrackingResponseDto> delete(ID id,
                                            Function<ID, Mono<Boolean>> deleteFn) {
        return deleteFn.apply(id)
                .flatMap(deleted -> deleted
                        ? Mono.just(TrackingResponseDtoData.createTrackingDto())
                        : Mono.empty());
    }

    public Mono<TrackingResponseDto> update(ID id,
                                            Mono<EN> reMono,
                                            BiFunction<ID, EN, Mono<Boolean>> updateFn) {
        return reMono
                .flatMap(re -> updateFn.apply(id, re))
                .flatMap(updated -> updated
                        ? Mono.just(TrackingResponseDtoData.createTrackingDto())
                        : Mono.empty());
    }
}
