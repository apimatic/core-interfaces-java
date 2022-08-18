package io.apimatic.core_interfaces.http.request.configuration;

import io.apimatic.core_interfaces.http.request.ArraySerializationFormat;

public interface CoreEndpointConfiguration {

    RequestRetryConfiguration getRequestRetryConfiguration();

    boolean hasBinaryResponse();

    ArraySerializationFormat getArraySerializationFormat();
}
