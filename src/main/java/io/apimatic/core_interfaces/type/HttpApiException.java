package io.apimatic.core_interfaces.type;

import io.apimatic.core_interfaces.http.Context;

public interface HttpApiException {

    int getResponseCode();

    Context getHttpContext();
}
