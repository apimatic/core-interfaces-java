package io.apimatic.core_interfaces.http.request.configuration;

public interface RequestRetryConfiguration {
    
    /**
     * The option for overriding global retry configuration.
     * @return the overrideRetryOption
     */
    RetryOption getRetryOption();
}
