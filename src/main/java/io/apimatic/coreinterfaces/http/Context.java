package io.apimatic.coreinterfaces.http;

import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.Response;

/**
 * To wrap the request sent to the server and the response received from the server.
 */
public interface Context {

    /**
     * Getter for the Http Request.
     * @return HttpRequest request.
     */
    Request getRequest();

    /**
     * Getter for the Http Response.
     * @return HttpResponse response.
     */
    Response getResponse();
}
