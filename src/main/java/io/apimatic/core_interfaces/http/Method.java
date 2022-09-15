package io.apimatic.core_interfaces.http;

public interface Method {
    final Method GET = HttpMethodType.GET;
    final Method POST = HttpMethodType.POST;
    final Method PUT = HttpMethodType.PUT;
    final Method PATCH = HttpMethodType.PATCH;
    final Method DELETE = HttpMethodType.DELETE;
    final Method HEAD = HttpMethodType.HEAD;
}


