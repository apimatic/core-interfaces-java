package io.apimatic.coreinterfaces.logger;

import java.util.Map;

import org.slf4j.event.Level;

/**
 * Interface representing an object capable of logging messages at different
 * levels.
 */
public interface Logger {

    /**
     * Logs a message with the specified logging level, format, and arguments.
     *
     * @param level     the logging level of the message
     * @param format    a format string for the message
     * @param arguments arguments referenced by the format string
     */
    void log(Level level, String format, Map<String, Object> argumentsKvp);
}
