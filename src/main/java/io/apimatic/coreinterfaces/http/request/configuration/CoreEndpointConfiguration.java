package io.apimatic.coreinterfaces.http.request.configuration;

import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;

/**
 * The configuration for an endpoint.
 */
public interface CoreEndpointConfiguration {

    /**
     * Retry options enumeration for HTTP request.
     * @return the option for the retries
     */
    RetryOption getRetryOption();

    /**
     * Endpoint response has binary response or not
     * @return the boolean which tells endpoint has binary response or not
     */
    boolean hasBinaryResponse();

    /**
     * Enumeration for all ArraySerialization formats
     * @return the array serialization format
     */
    ArraySerializationFormat getArraySerializationFormat();
}
