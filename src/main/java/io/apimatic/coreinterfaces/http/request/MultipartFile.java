package io.apimatic.coreinterfaces.http.request;

import io.apimatic.coreinterfaces.http.HttpHeaders;
import io.apimatic.coreinterfaces.type.CoreFileWrapper;

/**
 * Interface to wrap file and headers to be sent as part of a multipart request.
 */
public interface MultipartFile {

    /**
     * Getter for file wrapper.
     * @return FileWrapper instance
     */
    CoreFileWrapper getFileWrapper();

    /**
     * Getter for headers.
     * @return Headers
     */
    HttpHeaders getHeaders();
}
