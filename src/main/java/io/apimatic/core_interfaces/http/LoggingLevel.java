package io.apimatic.core_interfaces.http;

public interface LoggingLevel {
    final LoggingLevel INFO = LoggingLevelType.INFO;
    final LoggingLevel DEBUG = LoggingLevelType.DEBUG;
    final LoggingLevel ERROR = LoggingLevelType.ERROR;
    final LoggingLevel TRACE = LoggingLevelType.TRACE;
    final LoggingLevel WARN = LoggingLevelType.WARN;
}
