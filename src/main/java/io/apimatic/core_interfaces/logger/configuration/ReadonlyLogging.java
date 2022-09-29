package io.apimatic.core_interfaces.logger.configuration;

import java.util.Set;
import io.apimatic.core_interfaces.http.LoggingLevel;
import io.apimatic.core_interfaces.http.LoggingPolicy;
/**
 * Interface for holding logging configuration.
 */
public interface ReadonlyLogging {

    /**
     * Is logging request info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestInfo();

    /**
     * Is logging response info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseInfo();

    /**
     * Is logging request headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestHeaders();

    /**
     * Is logging response headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseHeaders();

    /**
     * Is logging request body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestBody();

    /**
     * Is logging response body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseBody();

    /**
     * Is pretty printing log message enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isPrettyPrinting();

    /**
     * Getter for level.
     * @return Level of logging.
     */
    public LoggingLevel getLevel();

    /**
     * Getter for header logging policy.
     * @return Logging policy for headers.
     */
    public LoggingPolicy getHeaderLoggingPolicy();

    /**
     * Getter for headers' filters.
     * @return Set of string headers to filter.
     */
    public Set<String> getHeaderFilters();
}