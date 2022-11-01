package io.apimatic.coreinterfaces.http;

/**
 * To provide the LoggingLevelType conversion
 */
public interface LoggingLevel {
    /**
     * Info log level
     */
    final LoggingLevel INFO = LoggingLevelType.INFO;

    /**
     * Debug log level
     */
    final LoggingLevel DEBUG = LoggingLevelType.DEBUG;

    /**
     * Error Log level
     */
    final LoggingLevel ERROR = LoggingLevelType.ERROR;

    /**
     * Trace Log level
     */
    final LoggingLevel TRACE = LoggingLevelType.TRACE;

    /**
     * Warn log level
     */
    final LoggingLevel WARN = LoggingLevelType.WARN;
}
