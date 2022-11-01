package io.apimatic.coreinterfaces.http;

/**
 * Enumeration Containing HttpMethods
 */
public interface Method {
    /**
     * Get Http Method
     */
    final Method GET = HttpMethodType.GET;
    /**
     * Post Http Method
     */
    final Method POST = HttpMethodType.POST;
    /**
     * Put Http Method
     */
    final Method PUT = HttpMethodType.PUT;
    /**
     * Patch Http Method
     */
    final Method PATCH = HttpMethodType.PATCH;
    /**
     * Get Delete Method
     */
    final Method DELETE = HttpMethodType.DELETE;
    /**
     * Head Http Method
     */
    final Method HEAD = HttpMethodType.HEAD;
}


