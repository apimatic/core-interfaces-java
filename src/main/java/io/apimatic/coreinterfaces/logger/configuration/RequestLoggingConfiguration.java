package io.apimatic.coreinterfaces.logger.configuration;

public interface RequestLoggingConfiguration extends HttpLoggingConfiguration {

    /**
     * Checks if logging of query parameters is required
     * @return True if logging of query parameters enabled, otherwise false.
     */
    boolean shouldIncludeQueryInPath();
}
