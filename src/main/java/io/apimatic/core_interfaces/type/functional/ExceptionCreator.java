package io.apimatic.core_interfaces.type.functional;

import io.apimatic.core_interfaces.http.Context;

@FunctionalInterface
public interface ExceptionCreator<T> {
    /**
     * Apply the reason , context and create the SDK exception
     * 
     * @param reason 
     * @param context
     * @return the configured SDK exception
     */
    T apply(String reason, Context context);
}
