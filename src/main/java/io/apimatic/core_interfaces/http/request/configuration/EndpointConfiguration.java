package io.apimatic.core_interfaces.http.request.configuration;

public interface EndpointConfiguration {

	RequestRetryConfiguration getRequestRetryConfiguration();
	
	boolean hasBinary();
}
