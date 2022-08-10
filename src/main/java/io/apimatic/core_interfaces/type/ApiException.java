package io.apimatic.core_interfaces.type;

import io.apimatic.core_interfaces.http.HttpContext;
import io.apimatic.core_interfaces.http.HttpMethod;

public interface ApiException {

	int getResponseCode();
	
	HttpContext getHttpContext();
}
