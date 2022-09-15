package io.apimatic.core_interfaces.http;

import io.apimatic.core_interfaces.http.request.Request;
import io.apimatic.core_interfaces.http.response.Response;

public interface Context {

    /**
     * Getter for the Http Request.
     * 
     * @return HttpRequest request.
     */
    public Request getRequest();

    /**
     * Getter for the Http Response.
     * 
     * @return HttpResponse response.
     */
    public Response getResponse();
}
