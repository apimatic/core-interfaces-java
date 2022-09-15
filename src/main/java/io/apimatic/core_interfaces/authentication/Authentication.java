package io.apimatic.core_interfaces.authentication;

import io.apimatic.core_interfaces.http.request.Request;

public interface Authentication {

    Request apply(Request httpRequest);
}
