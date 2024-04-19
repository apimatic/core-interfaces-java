package io.apimatic.coreinterfaces.logger.configuration;

public interface RequestLoggingOptions extends LoggingOptions {

    /**
     * Checks if logging of query parameters is required
     * @return True if logging of query parameters enabled, otherwise false.
     */
    boolean shouldIncludeQueryInPath();
}
