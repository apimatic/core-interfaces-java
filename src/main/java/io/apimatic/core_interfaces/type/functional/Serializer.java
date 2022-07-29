package io.apimatic.core_interfaces.type.functional;

import java.io.IOException;

@FunctionalInterface
public interface Serializer {
    String apply(Object responseData) throws IOException;
}
