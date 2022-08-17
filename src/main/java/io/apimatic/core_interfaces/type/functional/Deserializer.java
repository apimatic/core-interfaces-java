package io.apimatic.core_interfaces.type.functional;

import java.io.IOException;

@FunctionalInterface
public interface Deserializer<ResponseType> {
    ResponseType apply(String responseData) throws IOException;
}


