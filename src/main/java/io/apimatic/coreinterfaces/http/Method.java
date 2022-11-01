package io.apimatic.coreinterfaces.http;

/**
 * Enumeration Containing HttpMethods
 */
public interface Method {
    /**
     * Get Http Method
     */
    Method GET = HttpMethodType.GET;
    /**
     * Post Http Method
     */
    Method POST = HttpMethodType.POST;
    /**
     * Put Http Method
     */
    Method PUT = HttpMethodType.PUT;
    /**
     * Patch Http Method
     */
    Method PATCH = HttpMethodType.PATCH;
    /**
     * Get Delete Method
     */
    Method DELETE = HttpMethodType.DELETE;
    /**
     * Head Http Method
     */
    Method HEAD = HttpMethodType.HEAD;
}


