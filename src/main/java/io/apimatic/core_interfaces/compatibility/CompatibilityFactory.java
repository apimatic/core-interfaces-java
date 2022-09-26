package io.apimatic.core_interfaces.compatibility;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import io.apimatic.core_interfaces.http.Context;
import io.apimatic.core_interfaces.http.Method;
import io.apimatic.core_interfaces.http.HttpHeaders;
import io.apimatic.core_interfaces.http.request.Request;
import io.apimatic.core_interfaces.http.response.ApiResponseType;
import io.apimatic.core_interfaces.http.response.Response;
import io.apimatic.core_interfaces.http.response.DynamicType;

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
