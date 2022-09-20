package io.apimatic.core_interfaces.http;

public interface LoggingPolicy {
    final LoggingPolicy INCLUDE = HeaderLoggingPolicyLevel.INCLUDE;
    final LoggingPolicy EXCLUDE = HeaderLoggingPolicyLevel.EXCLUDE;
}
