package io.apimatic.coreinterfaces.type.functional;

import java.io.IOException;
import io.apimatic.coreinterfaces.http.Context;


/**
 * Functional Interface to apply the context initialization function for the response models.
 * @param <ResponseType> The type of the response in which context initialised.
 */
@FunctionalInterface
public interface ContextInitializer<ResponseType> {
    /**
     * @param context the context of the api call
     * @param response the response from the server
     * @return the Response
     */
    ResponseType apply(Context context, ResponseType response);
}
