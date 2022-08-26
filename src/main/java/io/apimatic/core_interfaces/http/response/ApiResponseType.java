package io.apimatic.core_interfaces.http.response;

import io.apimatic.core_interfaces.http.HttpHeaders;


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
