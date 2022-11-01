package io.apimatic.coreinterfaces.http.request;

/**
 * Enumeration for the Response class types
 */
public enum ResponseClassType {
    /**
     * Response type should be {@link ApiResponseType}
     */
    API_RESPONSE,
    /**
     * Response type should be {@link DynamicType}
     */
    DYNAMIC_RESPONSE,
    /**
     * Response type {@link ApiResponseType} encapsulates the {@link DynamicType}
     */
    DYNAMIC_API_RESPONSE
}
