package io.apimatic.coreinterfaces.logger;

import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.Response;

/**
 * To log the useful information
 */
public interface ApiLogger {

    /**
     * Log requests.
     * @param request HttpRequest to be logged.
     * @param url String request URL.
     */
    void logRequest(Request request, String url);

    /**
     * Log requests.
     * @param request HttpRequest to be logged.
     * @param url String request URL.
     * @param additionalMessage Any additional message to be logged.
     */
    void logRequest(Request request, String url, String additionalMessage);

    /**
     * Log Responses.
     * @param request HttpRequest that completed.
     * @param response HttpResponse to be logged.
     */
    void logResponse(Request request, Response response);

    /**
     * This should mark the start of the log scope.
     * Call it before logging the request.
     */
    void startScope();

    /**
     * This should mark the end of the log scope.
     * Call it after logging the response.
     */
    void closeScope();

    /**
     * Log error occurred on executing Request
     * @param request HttpRequest to be logged.
     * @param error Throwable occurred
     */
    void logRequestError(Request request, String url, Throwable error);
}
