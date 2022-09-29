package io.apimatic.coreinterfaces.type.functional;

import io.apimatic.coreinterfaces.http.Context;

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
