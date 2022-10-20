package io.apimatic.coreinterfaces.http.response;

import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;
import io.apimatic.coreinterfaces.http.HttpHeaders;


/**
 * Represents dynamic response returned by an API call.
 * 
 */
public interface DynamicType {

    /**
     * Parse response as instance of class cls.
     * 
     * @param <T> The type of class to be parsed
     * @param cls Class to be parsed
     * @return Object of type T
     * @throws ParseException Signals if a parse exception occured
     */
    <T> T parse(Class<T> cls) throws ParseException;

    /**
     * Parse response as boolean.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    boolean parseAsBoolean() throws ParseException;

    /**
     * Parse response as boolean.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    byte parseAsByte() throws ParseException;

    /**
     * Parse response as character.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    char parseAsCharacter() throws ParseException;

    /**
     * Parse response as float.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    float parseAsFloat() throws ParseException;

    /**
     * Parse response as integer.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    int parseAsInteger() throws ParseException;

    /**
     * Parse response as long.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    long parseAsLong() throws ParseException;

    /**
     * Parse response as short.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    short parseAsShort() throws ParseException;

    /**
     * Parse response as double.
     * 
     * @return Parsed value
     * @throws ParseException Signals if a parse exception occured
     */
    double parseAsDouble() throws ParseException;

    /**
     * Parse response as string.
     * 
     * @return Parsed value
     */
    String parseAsString();

    /**
     * Parse response as a map of keys and values.
     * 
     * @return Parsed map
     * @throws ParseException Signals if a parse exception occured
     */
    Map<String, Object> parseAsDictionary() throws ParseException;

    /**
     * Get the raw stream for the response body.
     * 
     * @return Raw body
     */
    InputStream getRawBody();

    /**
     * Get response headers for the HTTP response.
     * 
     * @return Headers
     */
    HttpHeaders getHeaders();

}
