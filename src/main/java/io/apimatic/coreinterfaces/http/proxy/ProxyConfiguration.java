package io.apimatic.coreinterfaces.http.proxy;

public interface ProxyConfiguration {

    /**
     * Returns the address (hostname or IP) of the proxy server.
     *
     * @return the proxy server address as a {@link String}
     */
    String getAddress();

    /**
     * Returns the port number on which the proxy server is listening.
     *
     * @return the proxy server port
     */
    int getPort();

    /**
     * Returns the username used for proxy authentication.
     *
     * @return the proxy authentication username as a {@link String}
     */
    String getUsername();

    /**
     * Returns the password associated with the proxy authentication username.
     *
     * @return the proxy authentication password as a {@link String}
     */
    String getPassword();
}
