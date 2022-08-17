package io.apimatic.core_interfaces.http.response;

import java.io.InputStream;
import io.apimatic.core_interfaces.http.HttpHeaders;

public interface CoreHttpResponse {

    /**
     * HTTP Status code of the http response.
     * 
     * @return Int status code
     */
    public int getStatusCode();

    /**
     * Headers of the http response.
     * 
     * @return Headers
     */
    public HttpHeaders getHeaders();

    /**
     * Raw body of the http response.
     * 
     * @return InputStream
     */
    public InputStream getRawBody();

    /**
     * String representation for raw body of the http response.
     * 
     * @return String
     */
    public String getRawBodyString();

    /**
     * String body of the http response.
     * 
     * @return String response body
     */
    public String getBody();
}
