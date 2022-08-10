package io.apimatic.core_interfaces.type.functional;


import io.apimatic.core_interfaces.http.response.HttpResponse;

@FunctionalInterface
public interface ObjectCreator<ResponseType> {
	 ResponseType apply(HttpResponse responseData);
}

