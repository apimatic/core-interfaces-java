package io.apimatic.coreinterfaces.type;

import io.apimatic.coreinterfaces.http.Context;

public interface HttpApiException {

    int getResponseCode();

    Context getHttpContext();
}
