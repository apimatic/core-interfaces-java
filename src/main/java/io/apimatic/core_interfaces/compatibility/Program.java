package io.apimatic.core_interfaces.compatibility;

import java.util.HashSet;
import java.util.Set;
import io.apimatic.core_interfaces.http.CoreHttpMethod;

public class Program {
    public static void main(String[] args) {
        Set<CoreHttpMethod> methods = new HashSet<CoreHttpMethod>();
        methods.add(CoreHttpMethod.GET);
        methods.add(CoreHttpMethod.HEAD);
        methods.add(CoreHttpMethod.POST);
        
        //methods.forEach(httpMethod -> System.out.println(httpMethod.toString()));
    }
}
