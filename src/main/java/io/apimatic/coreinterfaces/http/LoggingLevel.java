package io.apimatic.coreinterfaces.http;

/**
 * To provide the LoggingLevelType conversion
 *
 */
public interface LoggingLevel {
    final LoggingLevel INFO = LoggingLevelType.INFO;
    final LoggingLevel DEBUG = LoggingLevelType.DEBUG;
    final LoggingLevel ERROR = LoggingLevelType.ERROR;
    final LoggingLevel TRACE = LoggingLevelType.TRACE;
    final LoggingLevel WARN = LoggingLevelType.WARN;
}
