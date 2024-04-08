package io.apimatic.coreinterfaces.logger.configuration;

import java.util.Set;
import io.apimatic.coreinterfaces.http.LoggingLevel;
import io.apimatic.coreinterfaces.http.LoggingPolicy;

/**
 * To hold logging configuration
 */
public interface ReadonlyLogging {
    /**
     * Getter for level.
     * @return Level of logging.
     */
    LoggingLevel getLevel();
    
    boolean getEnableDefaultConsoleLogging();
}
