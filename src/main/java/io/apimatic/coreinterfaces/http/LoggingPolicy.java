package io.apimatic.coreinterfaces.http;

public interface LoggingPolicy {
    final LoggingPolicy INCLUDE = HeaderLoggingPolicyLevel.INCLUDE;
    final LoggingPolicy EXCLUDE = HeaderLoggingPolicyLevel.EXCLUDE;
}
