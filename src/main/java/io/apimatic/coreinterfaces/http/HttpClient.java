package io.apimatic.coreinterfaces.http;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.request.configuration.CoreEndpointConfiguration;
import io.apimatic.coreinterfaces.http.response.Response;

/**
 * To send HTTP Requests and read the responses.
 */
public interface HttpClient {

    /**
     * Execute a given Request to get string/binary response back.
     * @param request The given HttpRequest to execute.
     * @param endpointConfiguration The overridden configuration for request.
     * @return CompletableFuture of Response after execution.
     */
    CompletableFuture<Response> executeAsync(final Request request,
            CoreEndpointConfiguration endpointConfiguration);

    /**
     * Execute a given Request to get string/binary response back.
     * @param request The given Request to execute.
     * @param endpointConfiguration The overridden configuration for request.
     * @return The converted response.
     * @throws IOException exception to be thrown while converting response.
     */
    Response execute(final Request request, CoreEndpointConfiguration endpointConfiguration)
            throws IOException;
}
