package io.apimatic.coreinterfaces.http.response;

import java.io.InputStream;
import io.apimatic.coreinterfaces.http.HttpHeaders;

/**
 * To hold HTTP Response.
 */
public interface Response {

    /**
     * HTTP Status code of the http response.
     * @return Int status code
     */
    int getStatusCode();

    /**
     * Headers of the http response.
     * @return Headers
     */
    HttpHeaders getHeaders();

    /**
     * Raw body of the http response.
     * @return InputStream
     */
    InputStream getRawBody();

    /**
     * String representation for raw body of the http response.
     * @return String
     */
    String getRawBodyString();

    /**
     * String body of the http response.
     * @return String response body
     */
    String getBody();
}
