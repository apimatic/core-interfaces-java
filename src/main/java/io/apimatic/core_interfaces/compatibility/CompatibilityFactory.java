package io.apimatic.core_interfaces.compatibility;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import io.apimatic.core_interfaces.http.HttpContext;
import io.apimatic.core_interfaces.http.HttpHeaders;
import io.apimatic.core_interfaces.http.HttpMethod;
import io.apimatic.core_interfaces.http.request.HttpRequest;
import io.apimatic.core_interfaces.http.response.HttpResponse;

public interface CompatibilityFactory {

    HttpContext createHttpContext(HttpRequest request, HttpResponse response);

    HttpRequest createHttpRequest(HttpMethod httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters,
            List<SimpleEntry<String, Object>> formParameters);

    HttpRequest createHttpRequest(HttpMethod httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters, Object body);

    HttpResponse createHttpResponse(int code, HttpHeaders headers, InputStream rawBody);

    HttpResponse createHttpResponse(int code, HttpHeaders headers, InputStream rawBody, String body);

    HttpHeaders createHttpHeaders(Map<String, List<String>> headers);
    
    HttpHeaders createHttpHeaders(HttpHeaders headers);
    
}
