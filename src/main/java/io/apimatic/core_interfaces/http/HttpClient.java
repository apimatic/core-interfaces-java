package io.apimatic.core_interfaces.http;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import io.apimatic.core_interfaces.http.request.HttpRequest;
import io.apimatic.core_interfaces.http.request.configuration.EndpointConfiguration;
import io.apimatic.core_interfaces.http.request.configuration.RequestRetryConfiguration;
import io.apimatic.core_interfaces.http.response.HttpResponse;

public interface HttpClient {

    /**
     * Execute a given HttpRequest to get string/binary response back.
     * 
     * @param request The given HttpRequest to execute.
     * @param hasBinaryResponse Whether the response is binary or string.
     * @param retryConfiguration The overridden retry configuration for request.
     * @return CompletableFuture of HttpResponse after execution.
     */
    public CompletableFuture<HttpResponse> executeAsync(final HttpRequest request,
    		EndpointConfiguration endpointConfiguration);

    /**
     * Execute a given HttpRequest to get string/binary response back.
     * 
     * @param request The given HttpRequest to execute.
     * @param hasBinaryResponse Whether the response is binary or string.
     * @param retryConfiguration The overridden retry configuration for request.
     * @return The converted http response.
     * @throws IOException exception to be thrown while converting response.
     */
    public HttpResponse execute(final HttpRequest request, EndpointConfiguration endpointConfiguration)  throws IOException;
}
