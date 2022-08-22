package io.apimatic.core_interfaces.compatibility;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import io.apimatic.core_interfaces.http.CoreHttpContext;
import io.apimatic.core_interfaces.http.CoreHttpMethod;
import io.apimatic.core_interfaces.http.HttpHeaders;
import io.apimatic.core_interfaces.http.request.CoreHttpRequest;
import io.apimatic.core_interfaces.http.response.CoreHttpResponse;
import io.apimatic.core_interfaces.http.response.DynamicType;

public interface CompatibilityFactory {

    CoreHttpContext createHttpContext(CoreHttpRequest request, CoreHttpResponse response);

    CoreHttpRequest createHttpRequest(CoreHttpMethod httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters,
            List<SimpleEntry<String, Object>> formParameters);

    CoreHttpRequest createHttpRequest(CoreHttpMethod httpMethod, StringBuilder queryUrlBuilder,
            HttpHeaders headers, Map<String, Object> queryParameters, Object body);

    CoreHttpResponse createHttpResponse(int code, HttpHeaders headers, InputStream rawBody);

    CoreHttpResponse createHttpResponse(int code, HttpHeaders headers, InputStream rawBody,
            String body);

    HttpHeaders createHttpHeaders(Map<String, List<String>> headers);

    HttpHeaders createHttpHeaders(HttpHeaders headers);

    HttpHeaders createHttpHeaders();

    DynamicType createDynamicResponse(CoreHttpResponse httpResponse);
}
