package io.apimatic.coreinterfaces.http.response;

import io.apimatic.coreinterfaces.http.HttpHeaders;

/**
 * Complete Http Reponse Type
 * @param <T> the underneath Type
 */
public interface ApiResponseType<T> {

    /**
     * HTTP Status code of the api response.
     * @return Int status code
     */
    int getStatusCode();

    /**
     * Headers of the http response.
     * @return Headers
     */
    HttpHeaders getHeaders();

    /**
     * The deserialized result of the api response.
     * @return result of type T
     */
    T getResult();

}
