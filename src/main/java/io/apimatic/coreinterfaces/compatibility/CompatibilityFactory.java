package io.apimatic.coreinterfaces.compatibility;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import io.apimatic.coreinterfaces.http.Context;
import io.apimatic.coreinterfaces.http.HttpHeaders;
import io.apimatic.coreinterfaces.http.Method;
import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.ApiResponseType;
import io.apimatic.coreinterfaces.http.response.DynamicType;
import io.apimatic.coreinterfaces.http.response.Response;

/**
 * For the backward compatibility
 */
public interface CompatibilityFactory {

    /**
     * Create the HttpContext
     * @param request An instance of {@link Request}
     * @param response An instance of {@link Response}
     * @return {@link Context}
     */
    Context createHttpContext(Request request, Response response);

    /**
     * Create the HttpRequest
     * @param httpMethod A Http Method {@link Method}
     * @param queryUrlBuilder The UrlBuilder
     * @param headers The Request {@link HttpHeaders}
     * @param queryParameters Map of query parameters
     * @param formParameters List of form parameters
     * @return {@link Request}
     */
    Request createHttpRequest(Method httpMethod, StringBuilder queryUrlBuilder, HttpHeaders headers,
            Map<String, Object> queryParameters, List<SimpleEntry<String, Object>> formParameters);

    /**
     * Create the HttpRequest
     * @param httpMethod A Http Method {@link Method}
     * @param queryUrlBuilder The urlBuilder
     * @param headers The request {@link HttpHeaders}
     * @param queryParameters Map of query parameters
     * @param body The request body
     * @return {@link Request}
     */
    Request createHttpRequest(Method httpMethod, StringBuilder queryUrlBuilder, HttpHeaders headers,
            Map<String, Object> queryParameters, Object body);

    /**
     * Creat the HttpResponse
     * @param code A response code
     * @param headers The response {@link HttpHeaders}
     * @param rawBody The response {@link InputStream}
     * @return {@link Response}
     */
    Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody);

    /**
     * Create the HttpResponse
     * @param code A response code
     * @param headers The response {@link HttpHeaders}
     * @param rawBody The response {@link InputStream}
     * @param body The response body
     * @return {@link Response}
     */
    Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody, String body);

    /**
     * Create the {@link HttpHeaders}
     * @param headers Map of headers
     * @return {@link HttpHeaders}
     */
    HttpHeaders createHttpHeaders(Map<String, List<String>> headers);

    /**
     * Create the {@link HttpHeaders}
     * @param headers An instance of {@link HttpHeaders}
     * @return {@link HttpHeaders}
     */
    HttpHeaders createHttpHeaders(HttpHeaders headers);

    /**
     * Create the HttpHeaders
     * @return {@link HttpHeaders}
     */
    HttpHeaders createHttpHeaders();

    /**
     * Create the {@link DynamicType}
     * @param httpResponse An instance of {@link Response}
     * @return {@link DynamicType}}
     */
    DynamicType createDynamicResponse(Response httpResponse);

    /**
     * Create the {@link ApiResponseType}
     * @param <T> The type which will be enclose by {@link ApiResponseType}
     * @param statusCode A response code
     * @param headers An instance of {@link HttpHeaders}
     * @param result The response
     * @return {@link ApiResponseType}
     */
    <T> ApiResponseType<T> createApiResponse(int statusCode, HttpHeaders headers, T result);
}
