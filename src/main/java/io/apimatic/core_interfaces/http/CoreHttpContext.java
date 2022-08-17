package io.apimatic.core_interfaces.http;

import io.apimatic.core_interfaces.http.request.CoreHttpRequest;
import io.apimatic.core_interfaces.http.response.CoreHttpResponse;

public interface CoreHttpContext {

    /**
     * Getter for the Http Request.
     * 
     * @return HttpRequest request.
     */
    public CoreHttpRequest getRequest();

    /**
     * Getter for the Http Response.
     * 
     * @return HttpResponse response.
     */
    public CoreHttpResponse getResponse();
}
