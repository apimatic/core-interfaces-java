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
 *
 */
public interface CompatibilityFactory {

    Context createHttpContext(Request request, Response response);

    Request createHttpRequest(Method httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters,
            List<SimpleEntry<String, Object>> formParameters);

    Request createHttpRequest(Method httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters, Object body);

    Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody);

    Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody,
            String body);

    HttpHeaders createHttpHeaders(Map<String, List<String>> headers);

    HttpHeaders createHttpHeaders(HttpHeaders headers);

    HttpHeaders createHttpHeaders();

    DynamicType createDynamicResponse(Response httpResponse);
    
    <T> ApiResponseType<T> createApiResponse(int statusCode, HttpHeaders headers, T result);
}
