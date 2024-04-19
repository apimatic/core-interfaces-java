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
     * Getter for ReadonlyRequestLogging
     * @return ReadonlyRequestLogging
     */
    RequestLoggingOptions getRequestLogOptions();

    /**
     * Getter for ReadonlyResponseLogging
     * @return ReadonlyResponseLogging
     */
    ResponseLoggingOptions getResponseLogOptions();
}
