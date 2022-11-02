package io.apimatic.coreinterfaces.logger.configuration;

import java.util.Set;
import io.apimatic.coreinterfaces.http.LoggingLevel;
import io.apimatic.coreinterfaces.http.LoggingPolicy;

/**
 * To hold logging configuration
 */
public interface ReadonlyLogging {

    /**
     * Is logging request info enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingRequestInfo();

    /**
     * Is logging response info enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingResponseInfo();

    /**
     * Is logging request headers enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingRequestHeaders();

    /**
     * Is logging response headers enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingResponseHeaders();

    /**
     * Is logging request body enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingRequestBody();

    /**
     * Is logging response body enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isLoggingResponseBody();

    /**
     * Is pretty printing log message enabled.
     * @return true if enabled, false otherwise.
     */
    boolean isPrettyPrinting();

    /**
     * Getter for level.
     * @return Level of logging.
     */
    LoggingLevel getLevel();

    /**
     * Getter for header logging policy.
     * @return Logging policy for headers.
     */
    LoggingPolicy getHeaderLoggingPolicy();

    /**
     * Getter for headers' filters.
     * @return Set of string headers to filter.
     */
    Set<String> getHeaderFilters();
}
