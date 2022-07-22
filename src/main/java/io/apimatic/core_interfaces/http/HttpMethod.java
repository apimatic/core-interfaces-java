package io.apimatic.core_interfaces.http;

public interface HttpMethod {
    final HttpMethod GET = HttpMethodType.GET;
    final HttpMethod POST = HttpMethodType.POST;
    final HttpMethod PUT = HttpMethodType.PUT;
    final HttpMethod PATCH = HttpMethodType.PATCH;
    final HttpMethod DELETE = HttpMethodType.DELETE;
    final HttpMethod HEAD = HttpMethodType.HEAD;
}
