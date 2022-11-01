package io.apimatic.coreinterfaces.type.functional;

import io.apimatic.coreinterfaces.http.Context;

/**
 * Functional interface to create the SDK Exception
 * @param <T> The type of exception to create.
 */
@FunctionalInterface
public interface ExceptionCreator<T> {
    /**
     * Apply the reason , context and create the SDK exception.
     * @param reason The reason for configured exception to occur.
     * @param context The context for HTTP request and HTTP response.
     * @return the configured SDK exception.
     */
    T apply(String reason, Context context);
}
