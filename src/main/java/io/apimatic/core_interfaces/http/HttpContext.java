package io.apimatic.core_interfaces.http;

import io.apimatic.core_interfaces.http.request.HttpRequest;
import io.apimatic.core_interfaces.http.response.HttpResponse;

public interface HttpContext {

    /**
     * Getter for the Http Request.
     * 
     * @return HttpRequest request.
     */
    public HttpRequest getRequest();

    /**
     * Getter for the Http Response.
     * 
     * @return HttpResponse response.
     */
    public HttpResponse getResponse();
}
