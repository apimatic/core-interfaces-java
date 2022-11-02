package io.apimatic.coreinterfaces.type;

import java.io.File;

/**
 * To wrap file and contentType to be sent as part of a HTTP request.
 */
public interface CoreFileWrapper {

    /**
     * Getter for file.
     * @return File instance
     */
    File getFile();

    /**
     * Getter for content type.
     * @return content type of the file
     */
    String getContentType();
}
