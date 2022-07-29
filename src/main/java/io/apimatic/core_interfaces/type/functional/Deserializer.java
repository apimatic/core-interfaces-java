package io.apimatic.core_interfaces.type.functional;

import java.io.IOException;

@FunctionalInterface
public interface Deserializer<T> {
    T apply(String responseData) throws IOException;
}
