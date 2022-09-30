package io.apimatic.coreinterfaces.type.functional;

import java.io.IOException;

/**
 * Functional Interface to apply the deserializer function
 *
 * @param <ResponseType>
 */
@FunctionalInterface
public interface Deserializer<ResponseType> {
    /**
     * Apply the deserialization function and returns the ResponseType response
     * 
     * @param responseData the function for deserialization
     * @return the deserialized data
     * @throws IOException
     */
    ResponseType apply(String responseData) throws IOException;
}


