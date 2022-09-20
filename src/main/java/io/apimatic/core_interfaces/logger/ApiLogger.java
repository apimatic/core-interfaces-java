package io.apimatic.core_interfaces.logger;

import io.apimatic.core_interfaces.http.request.Request;
import io.apimatic.core_interfaces.http.response.Response;

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
     * Set error for failed requests.
     * @param request HttpRequest that failed.
     * @param error   Throwable occurred.
     */
    void setError(Request request, Throwable error);

    /**
     * Log Responses.
     * @param request  HttpRequest that completed.
     * @param response HttpResponse to be logged.
     */
    void logResponse(Request request, Response response);

    /**
     * Log Responses.
     * @param request  HttpRequest that completed.
     * @param response HttpResponse to be logged.
     * @param additionalMessage Any additional message to be logged.
     */
    void logResponse(Request request, Response response, String additionalMessage);

}
