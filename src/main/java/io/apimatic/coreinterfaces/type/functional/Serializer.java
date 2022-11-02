package io.apimatic.coreinterfaces.type.functional;

import java.io.IOException;

/**
 * Functional Interface to apply the serializer function
 */
@FunctionalInterface
public interface Serializer {
    /**
     * Apply the serialization function and returns the serialized string
     * @return the serialized string
     * @throws IOException Exception to be thrown while applying the function.
     */
    String supply() throws IOException;
}
