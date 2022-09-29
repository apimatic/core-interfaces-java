package io.apimatic.coreinterfaces.http;

import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.Response;

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
