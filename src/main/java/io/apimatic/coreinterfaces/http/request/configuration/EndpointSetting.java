package io.apimatic.coreinterfaces.http.request.configuration;

import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;

public interface EndpointSetting {

    RetryOption getRetryOption();

    boolean hasBinaryResponse();

    ArraySerializationFormat getArraySerializationFormat();
}
