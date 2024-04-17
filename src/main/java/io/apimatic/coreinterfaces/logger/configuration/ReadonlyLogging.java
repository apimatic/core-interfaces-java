package io.apimatic.coreinterfaces.logger.configuration;

import org.slf4j.event.Level;

import io.apimatic.coreinterfaces.logger.Logger;


/**
 * To hold logging configuration
 */
public interface ReadonlyLogging {
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
     * @return boolean for mask sensitive header
     */
    boolean getMaskSensitiveHeaders();
    
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
