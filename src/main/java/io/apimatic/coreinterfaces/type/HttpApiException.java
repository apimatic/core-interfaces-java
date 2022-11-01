package io.apimatic.coreinterfaces.type;

import io.apimatic.coreinterfaces.http.Context;

/**
 * To save the Api exception context and response code
 */
public interface HttpApiException {

    /**
     * Get the response code
     * @return response code
     */
    int getResponseCode();

    /**
     * Get the HttpContext
     * @return {@link Context}
     */
    Context getHttpContext();
}
