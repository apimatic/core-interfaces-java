package io.apimatic.core_interfaces.http;

public interface CoreHttpMethod {
    final CoreHttpMethod GET = HttpMethodType.GET;
    final CoreHttpMethod POST = HttpMethodType.POST;
    final CoreHttpMethod PUT = HttpMethodType.PUT;
    final CoreHttpMethod PATCH = HttpMethodType.PATCH;
    final CoreHttpMethod DELETE = HttpMethodType.DELETE;
    final CoreHttpMethod HEAD = HttpMethodType.HEAD;
}


