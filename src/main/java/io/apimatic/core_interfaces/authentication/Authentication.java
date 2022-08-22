package io.apimatic.core_interfaces.authentication;

import io.apimatic.core_interfaces.http.request.CoreHttpRequest;

public interface Authentication {

    CoreHttpRequest apply(CoreHttpRequest httpRequest);
}
