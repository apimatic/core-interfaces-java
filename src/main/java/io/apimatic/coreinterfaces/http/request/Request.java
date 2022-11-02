package io.apimatic.coreinterfaces.http.request;

import java.util.AbstractMap.SimpleEntry;
import io.apimatic.coreinterfaces.http.HttpHeaders;
import io.apimatic.coreinterfaces.http.Method;
import java.util.List;
import java.util.Map;

/**
 * To create and manage HTTP Requests.
 */
public interface Request {

    /**
     * HttpMethod for the http request.
     * @return HttpMethod
     */
    Method getHttpMethod();

    /**
     * Headers for the http request.
     * @return Headers
     */
    HttpHeaders getHeaders();

    /**
     * Query url for the http request.
     * @return String query url
     */
    String getQueryUrl();

    /**
     * Get the request URL
     * @param arraySerializationFormat Array serialization format
     * @return String Url
     */
    String getUrl(ArraySerializationFormat arraySerializationFormat);

    /**
     * Parameters for the http request.
     * @return List of simple entries for form parameters
     */
    List<SimpleEntry<String, Object>> getParameters();

    /**
     * Query parameters for the http request.
     * @return Map of queryParameters
     */
    Map<String, Object> getQueryParameters();

    /**
     * Add Query parameter in http request.
     * @param key The key of query parameter to be added
     * @param value The value for respective query parameter
     */
    void addQueryParameter(String key, Object value);

    /**
     * Body for the http request.
     * @return Object body
     */
    Object getBody();

}
