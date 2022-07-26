package io.apimatic.coreinterfaces.http.request;

import io.apimatic.coreinterfaces.http.HttpHeaders;

/**
 * Interface to wrap byteArray and headers to be sent as part of a multipart request.
 */
public interface Multipart {

    /**
     * Getter for bytes.
     * @return Array of bytes.
     */
    byte[] getByteArray();

    /**
     * Getter for headers.
     * @return headers
     */
    HttpHeaders getHeaders();
}
