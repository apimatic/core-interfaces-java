package io.apimatic.core_interfaces.authentication;

import io.apimatic.core_interfaces.http.request.Request;

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
}
