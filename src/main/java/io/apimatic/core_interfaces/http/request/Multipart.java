package io.apimatic.core_interfaces.http.request;

import io.apimatic.core_interfaces.http.HttpHeaders;

/**
 * Interface to wrap byteArray and headers to be sent as part of a multipart request.
 */
public interface Multipart {

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
