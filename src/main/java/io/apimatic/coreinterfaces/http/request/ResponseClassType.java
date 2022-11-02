package io.apimatic.coreinterfaces.http.request;

/**
 * Enumeration for the Response class types
 */
public enum ResponseClassType {
    /**
     * Response type should be ApiResponseType
     */
    API_RESPONSE,
    /**
     * Response type should be DynamicType
     */
    DYNAMIC_RESPONSE,
    /**
     * Response type ApiResponseType encapsulates the DynamicType
     */
    DYNAMIC_API_RESPONSE
}
