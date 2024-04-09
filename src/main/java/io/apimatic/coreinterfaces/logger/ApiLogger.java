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
     * Adds a key-value pair to the context of the logger instance
     * This can then be used by the logger anywhere.
     * {@link #clearScope()} must be called after logging to avoid issues.
     * @param key Key used to access the value. 
     * @param val Value to be accessed.
     */
    void addToScope(String key, String val);


    /**
     * Clear all key-value pairs from the context of the logger instance.
     */
    void clearScope();

    /**
     * Log error occurred on executing Request
     * @param request HttpRequest to be logged.
     * @param error Throwable occurred
     */
    void logRequestError(Request request, String url, Throwable error);
}
