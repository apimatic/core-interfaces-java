/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.core_interfaces.http.request;

import io.apimatic.core_interfaces.http.HttpHeaders;

/**
 * Class to wrap byteArray and headers to be sent as part of a multipart request.
 */
public interface CoreMultipartWrapper {

    /**
     * Getter for bytes.
     * 
     * @return Array of bytes.
     */
    public byte[] getByteArray();

    /**
     * Getter for headers.
     * 
     * @return headers
     */
    public HttpHeaders getHeaders();
}
