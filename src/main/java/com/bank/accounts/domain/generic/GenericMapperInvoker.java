package com.bank.accounts.domain.generic;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public final class GenericMapperInvoker {
    private GenericMapperInvoker() {}

    @SuppressWarnings("unchecked")
    public static <R> R invoke(Class<?> mapperInterface, Object source, String methodName, Class<R> returnType) {
        Objects.requireNonNull(mapperInterface, "mapperInterface");
        Objects.requireNonNull(methodName, "methodName");
        Object mapper = MapperRegistry.get(mapperInterface);

        Method candidate = findCompatibleMethod(mapperInterface, methodName, source);
        if (candidate == null) {
            throw new IllegalArgumentException("No compatible method " + methodName + " found on " + mapperInterface.getName());
        }

        try {
            Object result = candidate.invoke(mapper, source);
            return returnType.cast(result);
        } catch (Exception e) {
            throw new RuntimeException("Error invoking mapper method", e);
        }
    }

    private static Method findCompatibleMethod(Class<?> mapperInterface, String methodName, Object source) {
        Method[] methods = mapperInterface.getMethods();
        return Arrays.stream(methods)
                .filter(m -> m.getName().equals(methodName))
                .filter(m -> {
                    Class<?>[] params = m.getParameterTypes();
                    if (params.length != 1) return false;
                    if (source == null) return true; // si source es null, aceptamos, caller debe conocer el contrato
                    return params[0].isAssignableFrom(source.getClass());
                })
                .findFirst()
                .orElse(null);
    }
}
