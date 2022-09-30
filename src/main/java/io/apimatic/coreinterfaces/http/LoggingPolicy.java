package io.apimatic.coreinterfaces.http;

/**
 * Logging policy
 *
 */
public interface LoggingPolicy {
    final LoggingPolicy INCLUDE = HeaderLoggingPolicyLevel.INCLUDE;
    final LoggingPolicy EXCLUDE = HeaderLoggingPolicyLevel.EXCLUDE;
}
