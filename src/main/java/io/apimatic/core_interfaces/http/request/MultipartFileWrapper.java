package io.apimatic.core_interfaces.http.request;

import io.apimatic.core_interfaces.http.HttpHeaders;
import io.apimatic.core_interfaces.type.FileWrapper;

/**
 * Class to wrap file and headers to be sent as part of a multipart request.
 */
public interface MultipartFileWrapper {

    /**
     * Getter for file wrapper.
     * @return FileWrapper instance
     */
    public FileWrapper getFileWrapper();

    /**
     * Getter for headers.
     * @return Headers
     */
    public HttpHeaders getHeaders();
}
