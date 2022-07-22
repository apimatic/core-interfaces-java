package io.apimatic.core_interfaces.type;

import java.io.File;

/**
 * Class to wrap file and contentType to be sent as part of a HTTP request.
 */
public interface FileWrapper {

    /**
     * Getter for file.
     * @return File instance
     */
    public File getFile();

    /**
     * Getter for content type.
     * @return content type of the file
     */
    public String getContentType();
}
