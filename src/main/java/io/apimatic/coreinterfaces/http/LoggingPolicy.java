package io.apimatic.coreinterfaces.http;

/**
 * Logging policy
 *
 */
public interface LoggingPolicy {
    /**
     * Include Headers in logging
     */
    final LoggingPolicy INCLUDE = HeaderLoggingPolicyLevel.INCLUDE;
    
    /**
     * Exclude Headers in logging
     */
    final LoggingPolicy EXCLUDE = HeaderLoggingPolicyLevel.EXCLUDE;
}
