package com.bank.accounts.domain.generic;

import org.mapstruct.factory.Mappers;

public final class MapperRegistry {
    private MapperRegistry() {}

    public static <M> M get(Class<M> mapperInterface) {
        return Mappers.getMapper(mapperInterface);
    }
}
