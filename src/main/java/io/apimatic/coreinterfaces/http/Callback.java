package io.apimatic.coreinterfaces.http;

import io.apimatic.coreinterfaces.http.request.Request;

/**
 * An Callback that captures the request and response for use later.
 */
public interface Callback {

    /**
     * Callback called just before the HTTP request is sent.
     * @param request The HTTP request to be executed
     */
    void onBeforeRequest(Request request);

    /**
     * Callback called just after the HTTP response is received.
     * @param context Context for the HTTP call
     */
    void onAfterResponse(Context context);
}
