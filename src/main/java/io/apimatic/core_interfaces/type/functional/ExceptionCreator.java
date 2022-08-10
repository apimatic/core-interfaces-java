package io.apimatic.core_interfaces.type.functional;

import io.apimatic.core_interfaces.http.HttpContext;

@FunctionalInterface
public interface ExceptionCreator<T> {
   T apply(String reason, HttpContext context);
}
