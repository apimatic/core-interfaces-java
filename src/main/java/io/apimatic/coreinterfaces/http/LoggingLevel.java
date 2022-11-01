package io.apimatic.coreinterfaces.http;

/**
 * To provide the LoggingLevelType conversion
 */
public interface LoggingLevel {
    /**
     * Info log level
     */
    LoggingLevel INFO = LoggingLevelType.INFO;

    /**
     * Debug log level
     */
    LoggingLevel DEBUG = LoggingLevelType.DEBUG;

    /**
     * Error Log level
     */
    LoggingLevel ERROR = LoggingLevelType.ERROR;

    /**
     * Trace Log level
     */
    LoggingLevel TRACE = LoggingLevelType.TRACE;

    /**
     * Warn log level
     */
    LoggingLevel WARN = LoggingLevelType.WARN;
}
