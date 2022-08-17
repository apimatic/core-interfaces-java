package io.apimatic.core_interfaces.type;

import io.apimatic.core_interfaces.http.CoreHttpContext;
import io.apimatic.core_interfaces.http.CoreHttpMethod;

public interface CoreApiException {

    int getResponseCode();

    CoreHttpContext getHttpContext();
}
