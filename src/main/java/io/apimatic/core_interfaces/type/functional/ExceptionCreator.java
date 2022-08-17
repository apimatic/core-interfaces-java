package io.apimatic.core_interfaces.type.functional;

import io.apimatic.core_interfaces.http.CoreHttpContext;

@FunctionalInterface
public interface ExceptionCreator<T> {
    T apply(String reason, CoreHttpContext context);
}
