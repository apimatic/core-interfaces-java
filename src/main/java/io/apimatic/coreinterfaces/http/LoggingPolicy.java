package io.apimatic.coreinterfaces.http;

/**
 * Logging policy
 */
public interface LoggingPolicy {
    /**
     * Include Headers in logging
     */
    LoggingPolicy INCLUDE = HeaderLoggingPolicyLevel.INCLUDE;

    /**
     * Exclude Headers in logging
     */
    LoggingPolicy EXCLUDE = HeaderLoggingPolicyLevel.EXCLUDE;
}
