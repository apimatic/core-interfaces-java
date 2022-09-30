package io.apimatic.coreinterfaces.type.functional;

import java.io.IOException;

/**
 * Functional Interface to apply the deserializer function.
 *
 * @param <ResponseType> The type of the response to deserialize into.
 */
@FunctionalInterface
public interface Deserializer<ResponseType> {
    /**
     * Apply the deserialization function and returns the ResponseType response.
     * 
     * @param responseData The function for deserialization.
     * @return The deserialized data.
     * @throws IOException Exception to be thrown while applying the function.
     */
    ResponseType apply(String responseData) throws IOException;
}


