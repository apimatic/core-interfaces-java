package io.apimatic.coreinterfaces.type.functional;

import java.io.IOException;

@FunctionalInterface
public interface Serializer {
    /**
     * Apply the serialization function and returns the serialized string
     * 
     * @param responseData the function for serialization
     * @return the serialized string
     * @throws IOException
     */
    String apply(Object responseData) throws IOException;
}
