package io.apimatic.core_interfaces.http.request;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import io.apimatic.core_interfaces.http.HttpHeaders;
import io.apimatic.core_interfaces.http.HttpMethod;

public interface HttpRequest {
    
    /**
     * HttpMethod for the http request.
     * 
     * @return HttpMethod
     */
    public HttpMethod getHttpMethod();

    /**
     * Headers for the http request.
     * 
     * @return Headers
     */
    public HttpHeaders getHeaders();

    /**
     * Query url for the http request.
     * 
     * @return String query url
     */
    public String getQueryUrl();

    public String getUrl();
    
    /**
     * Parameters for the http request.
     * 
     * @return List of simple entries for form parameters
     */
    public List<SimpleEntry<String, Object>> getParameters();

    /**
     * Query parameters for the http request.
     * 
     * @return Map of queryParameters
     */
    public Map<String, Object> getQueryParameters();

    /**
     * Add Query parameter in http request.
     * 
     * @param key The key of query parameter to be added
     * @param value The value for respective query parameter
     */
    public void addQueryParameter(String key, Object value);

    /**
     * Body for the http request.
     * 
     * @return Object body
     */
    public Object getBody();
    
}
