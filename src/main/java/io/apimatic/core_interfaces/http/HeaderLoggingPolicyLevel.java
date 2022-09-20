package io.apimatic.core_interfaces.http;


/**
 * HeaderLoggingPolicy enum to use with headerLoggingPolicy 
 * in {@link LoggingConfiguration.Builder}.
 * It is either used to exclude or include headers provided in header filters,
 * for various security reasons.
 */
public enum HeaderLoggingPolicyLevel implements LoggingPolicy{
    /**
     * Policy that only include the headerFilters as headers.
     * So all the headers that are not provided in header filters
     * will be excluded.
     */
    INCLUDE,
    
    /**
     * Policy that only exclude the headerFilters from headers.
     * So all the headers that are not provided in header filters
     * will be included.
     */
    EXCLUDE
}