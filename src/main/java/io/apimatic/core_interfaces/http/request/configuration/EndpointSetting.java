package io.apimatic.core_interfaces.http.request.configuration;

import io.apimatic.core_interfaces.http.request.ArraySerializationFormat;

public interface EndpointSetting {

    RetryOption getRetryOption();

    boolean hasBinaryResponse();

    ArraySerializationFormat getArraySerializationFormat();
}
