package io.apimatic.coreinterfaces.type;

import io.apimatic.coreinterfaces.http.Context;

/**
 * To save the Api exception context and response code
 *
 */
public interface HttpApiException {

    int getResponseCode();

    Context getHttpContext();
}
