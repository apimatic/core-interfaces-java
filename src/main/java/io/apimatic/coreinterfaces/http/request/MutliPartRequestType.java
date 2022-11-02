package io.apimatic.coreinterfaces.http.request;

/**
 * Mutipart Request enumeration.
 */
public enum MutliPartRequestType {
    /**
     * A request contains the {@link MultipartFile}
     */
    MULTI_PART_FILE,

    /**
     * A request contains the {@link Multipart}
     */
    MULTI_PART;
}
