package io.apimatic.coreinterfaces.logger.configuration;

import io.apimatic.coreinterfaces.http.LoggingLevel;

/**
 * To hold logging configuration
 */
public interface ReadonlyLogging {
    /**
     * Getter for level.
     * @return Level of logging.
     */
    LoggingLevel getLevel();
    
    /**
     * Getter for ReadonlyRequestLogging
     * @return ReadonlyRequestLogging
     */
    ReadonlyRequestLogging getRequestLogOptions();
    
    /**
     * Getter for ReadonlyResponseLogging
     * @return ReadonlyResponseLogging
     */
    ReadonlyResponseLogging getResponseLogOptions();
}
