package io.apimatic.coreinterfaces.logger;

import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.Response;

/**
 * To log the useful information
 */
public interface ApiLogger {

    /**
     * Log requests.
     * 
     * @param request HttpRequest to be logged.
     */
    void logRequest(Request request);

    /**
     * Log Responses.
     * 
     * @param response HttpResponse to be logged.
     */
    void logResponse(Response response);
}
