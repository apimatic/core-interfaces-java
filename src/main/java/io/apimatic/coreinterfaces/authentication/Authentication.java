package io.apimatic.coreinterfaces.authentication;

import io.apimatic.coreinterfaces.http.request.Request;

/**
 * To setup methods for authentication
 */
public abstract class Authentication {

    /**
     * Stores the validity of the auth scheme.
     */
    private boolean isValid;

    /**
     * Stores the error message for the auth scheme.
     */
    private String errorMessage;

    /**
     * Apply the authentication on the httpRequest.
     * @param httpRequest the request on which authentication is being applied.
     * @return the authenticated request.
     */
    public abstract Request apply(Request httpRequest);

    /**
     * Validates the auth params for the httpRequest.
     */
    public abstract void validate();

    /**
     * Checks if the auth credentials are valid.
     * @return true if the auth credentials are valid.
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * Sets the validatity of the auth credentials.
     * @param isValid the flag to set for validity.
     */
    public void setValidity(boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * Returns the error message if the auth credentials are not valid.
     * @return The string message whenever the auth credentials are not valid.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the error message for invalid auth credentials.
     * @param errorMessage the error message to set.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
