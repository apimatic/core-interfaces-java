package io.apimatic.core_interface.authentication;

import io.apimatic.core_interfaces.http.request.HttpRequest;

public interface AuthManager {

	HttpRequest apply(HttpRequest httpRequest);
}
