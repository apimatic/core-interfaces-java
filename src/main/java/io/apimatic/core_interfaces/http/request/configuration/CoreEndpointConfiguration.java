package io.apimatic.core_interfaces.http.request.configuration;

import io.apimatic.core_interfaces.http.request.ArraySerializationFormat;

public interface CoreEndpointConfiguration {

    RetryOption getRetryOption();

    boolean hasBinaryResponse();

    ArraySerializationFormat getArraySerializationFormat();
}
