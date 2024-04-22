package io.apimatic.coreinterfaces.logger.configuration;

import org.slf4j.event.Level;

import io.apimatic.coreinterfaces.logger.Logger;

/**
 * To hold logging configuration
 */
public interface LoggingConfiguration {

    /***
     * Getter for Logger
     * @return Logger Instance
     */
    Logger getLogger();

    /**
     * Getter for level.
     * @return Level of logging.
     */
    Level getLevel();

    /**
     * Getter for mask sensitive header
     * @return True if masking of sensitive headers is enabled, otherwise false.
     */
    boolean getMaskSensitiveHeaders();

    /**
     * Getter for RequestLoggingConfiguration
     * @return RequestLoggingConfiguration
     */
    RequestLoggingConfiguration getRequestConfig();

    /**
     * Getter for ResponseLoggingConfiguration
     * @return ResponseLoggingConfiguration
     */
    ResponseLoggingConfiguration getResponseConfig();
}
