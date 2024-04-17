package io.apimatic.coreinterfaces.logger.configuration;

public interface ReadonlyRequestLogging extends ReadonlyLogOptions {
	/**
     * Checks if logging of query parameters is required
     * @return True if logging of query parameters enabled, otherwise false.
     */
	boolean shouldIncludeQueryInPath();
}
