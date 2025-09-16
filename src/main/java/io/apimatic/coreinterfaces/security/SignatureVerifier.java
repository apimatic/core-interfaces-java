package io.apimatic.coreinterfaces.security;

import io.apimatic.coreinterfaces.http.request.Request;

import java.util.concurrent.CompletableFuture;

/**
 * Defines a contract for verifying the signature of an HTTP request.
 */
public interface SignatureVerifier {

    /**
     * Verifies the signature of the specified HTTP request.
     *
     * @param request The HTTP request data to verify.
     * @return A {@link CompletableFuture} containing the outcome of the verification process.
     */
    CompletableFuture<VerificationResult> verifyAsync(Request request);
}
