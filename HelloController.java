package com.myproject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    @Get("/") // This maps to GET http://localhost:8080/ 
    public String index() {
        return "Hello, World!";
    }

    @Get("/hello") // This maps to GET http://localhost:8080/hello
    public String sayHello() {
        return "Hi there from Micronaut!";
    }
}
