package io.apimatic.coreinterfaces.http;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * For creating and managing HTTP Headers.
 *
 */
public interface HttpHeaders {

    /**
     * Use to check if the given name is present in headers.
     * 
     * @param headerName String name for header to be checked.
     * @return true if headerName is found, false otherwise.
     */
    boolean has(String headerName);

    /**
     * Returns a Set containing all header names.
     * 
     * @return A Set containing all header names.
     */
    Set<String> names();

    /**
     * Get the first value associated with a given header name, or null if the header name is not
     * found.
     * 
     * @param headerName The header name to find the associated value for.
     * @return The first value associated with the given header name.
     */
    String value(String headerName);

    /**
     * Get a List of all values associated with a given header name, or null if the header name is
     * not found.
     * 
     * @param headerName The header name to find the associated values for.
     * @return A List of values associated with the given header name.
     */
    List<String> values(String headerName);

    /**
     * Returns a Map of the headers, giving only one value for each header name.
     * 
     * @return A Map of header names and values.
     */
    Map<String, String> asSimpleMap();

    /**
     * Returns a simulated MultiMap of the headers.
     * 
     * @return A Map of header names and values.
     */
    Map<String, List<String>> asMultimap();

    /**
     * Adds a value for a header name to this object, neither headerName nor value can be null.
     * 
     * @param headerName The header name to add the value against.
     * @param value The value to add.
     */
    void add(String headerName, String value);

    /**
     * Adds a List of values for a header name to this object. neither headerName nor values can be
     * null.
     * 
     * @param headerName The header name to add the values against.
     * @param values The List of values to add.
     */
    void add(String headerName, List<String> values);

    /**
     * Adds values from a Map to this object.
     * 
     * @param headers A Map containing header names and values as Entry pairs.
     */
    void addAllFromMap(Map<String, String> headers);

    /**
     * Adds values from a simulated Multi-Map to this object.
     * 
     * @param headers A Map containing header names and values as Entry pairs.
     */
    void addAllFromMultiMap(Map<String, List<String>> headers);

    /**
     * Adds all the entries in a Headers object to this object.
     * 
     * @param headers The object whose values are to be added to this object.
     */
    void addAll(HttpHeaders headers);

    /**
     * Removes the mapping for a header name if it is present, and get the value to which this map
     * previously associated the key, or null if the map contained no mapping for the key.
     * 
     * @param headerName The header name to remove the associated values for
     * @return A List of values associated with the given header name.
     */
    List<String> remove(String headerName);
}
