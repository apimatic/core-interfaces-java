package io.apimatic.core_interfaces.http;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import io.apimatic.core_interfaces.http.request.Request;
import io.apimatic.core_interfaces.http.request.configuration.EndpointSetting;
import io.apimatic.core_interfaces.http.response.Response;

/**
 * HTTP Client interface to send HTTP Requests and read the responses.
 *
 */
public interface HttpClient {

    /**
     * Execute a given Request to get string/binary response back.
     * 
     * @param request The given HttpRequest to execute.
     * @param endpointConfiguration The overridden configuration for request.
     * @return CompletableFuture of Response after execution.
     */
    public CompletableFuture<Response> executeAsync(final Request request,
            EndpointSetting endpointConfiguration);

    /**
     * Execute a given Request to get string/binary response back.
     * 
     * @param request The given Request to execute.
     * @param retryConfiguration The overridden retry configuration for request.
     * @return The converted response.
     * @throws IOException exception to be thrown while converting response.
     */
    public Response execute(final Request request, EndpointSetting endpointConfiguration)
            throws IOException;
}
