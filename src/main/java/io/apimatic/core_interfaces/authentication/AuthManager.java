package io.apimatic.core_interfaces.authentication;

import io.apimatic.core_interfaces.http.request.CoreHttpRequest;

public interface AuthManager {

	CoreHttpRequest apply(CoreHttpRequest httpRequest);
}
