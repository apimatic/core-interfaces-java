package io.apimatic.coreinterfaces.http.request;

/**
 * Enumeration for all ArraySerialization formats
 */
public enum ArraySerializationFormat {

    /**
     * Indexed values serialization format
     */
    INDEXED,
    /**
     * Unindexed array serialization format
     */
    UNINDEXED,
    /**
     * Plain value serialization format
     */
    PLAIN,
    /**
     * Pipe separated values serialization format
     */
    PSV,
    /**
     * Comma separated values serialization format
     */
    CSV,
    /**
     * Tab separated values serialization format
     */
    TSV
}
