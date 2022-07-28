package io.apimatic.core_interfaces.compatibility;

import java.util.HashSet;
import java.util.Set;
import io.apimatic.core_interfaces.http.HttpMethod;

public class Program {
    public static void main(String[] args) {
        Set<HttpMethod> methods = new HashSet<HttpMethod>();
        methods.add(HttpMethod.GET);
        methods.add(HttpMethod.HEAD);
        methods.add(HttpMethod.POST);
        
        //methods.forEach(httpMethod -> System.out.println(httpMethod.toString()));
    }
}
