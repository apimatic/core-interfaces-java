package io.apimatic.core_interfaces.http;

import io.apimatic.core_interfaces.http.request.HttpRequest;

public interface HttpCallback {

    /**
     * Callback called just before the HTTP request is sent.
     * 
     * @param request The HTTP request to be executed
     */
    public void onBeforeRequest(HttpRequest request);

    /**
     * Callback called just after the HTTP response is received.
     * 
     * @param context Context for the HTTP call
     */
    public void onAfterResponse(HttpContext context);
}
