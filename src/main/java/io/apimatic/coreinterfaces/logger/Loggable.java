package io.apimatic.coreinterfaces.logger;

import io.apimatic.coreinterfaces.http.LoggingLevel;

/**
 * Interface representing an object capable of logging messages at different levels.
 */
public interface Loggable {
    /**
     * Logs a message with the specified logging level, format, and arguments.
     *
     * @param level     the logging level of the message
     * @param format    a format string for the message
     * @param arguments arguments referenced by the format string
     */
    void log(LoggingLevel level, String format, Object... arguments);
}
