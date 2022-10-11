package io.apimatic.coreinterfaces.authentication;

import io.apimatic.coreinterfaces.http.request.Request;

/**
 * To setup methods for authentication
 *
 */
public interface Authentication {

    /**
     * Apply the authentication on the httpRequest
     * 
     * @param httpRequest the request on which authentication is being applied
     * @return the authenticated request
     */
    Request apply(Request httpRequest);
    
    /**
     * Validate the authentication on the httpRequest
     */
    void validate();
}
