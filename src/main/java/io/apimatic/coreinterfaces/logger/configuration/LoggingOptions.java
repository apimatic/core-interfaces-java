package io.apimatic.coreinterfaces.logger.configuration;

import java.util.List;

public interface LoggingOptions {

    /**
     * Checks if logging of request body is enabled.
     * @return True if logging of request body is enabled, otherwise false.
     */
    boolean shouldLogBody();

    /**
     * Checks if logging of request headers is enabled.
     * @return True if logging of request headers is enabled, otherwise false.
     */
    boolean shouldLogHeaders();

    /**
     * Gets the list of headers to include in logging.
     * @return An unmodifiable list of headers to include.
     */
    List<String> getHeadersToInclude();

    /**
     * Gets the list of headers to exclude from logging.
     * @return An unmodifiable list of headers to exclude.
     */
    List<String> getHeadersToExclude();

    /**
     * Retrieves the list of headers to unmask from logging.
     * @return An unmodifiable list of headers to unmask.
     */
    List<String> getHeadersToUnmask();
}
