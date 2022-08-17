package io.apimatic.core_interfaces.http;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import io.apimatic.core_interfaces.http.request.CoreHttpRequest;
import io.apimatic.core_interfaces.http.request.configuration.CoreEndpointConfiguration;
import io.apimatic.core_interfaces.http.request.configuration.RequestRetryConfiguration;
import io.apimatic.core_interfaces.http.response.CoreHttpResponse;

public interface HttpClient {

    /**
     * Execute a given HttpRequest to get string/binary response back.
     * 
     * @param request The given HttpRequest to execute.
     * @param hasBinaryResponse Whether the response is binary or string.
     * @param retryConfiguration The overridden retry configuration for request.
     * @return CompletableFuture of HttpResponse after execution.
     */
    public CompletableFuture<CoreHttpResponse> executeAsync(final CoreHttpRequest request,
    		CoreEndpointConfiguration endpointConfiguration);

    /**
     * Execute a given HttpRequest to get string/binary response back.
     * 
     * @param request The given HttpRequest to execute.
     * @param hasBinaryResponse Whether the response is binary or string.
     * @param retryConfiguration The overridden retry configuration for request.
     * @return The converted http response.
     * @throws IOException exception to be thrown while converting response.
     */
    public CoreHttpResponse execute(final CoreHttpRequest request, CoreEndpointConfiguration endpointConfiguration)  throws IOException;
}
