package com.ust.app.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @GetMapping
    public String sayHello(){
        return "Hello world! this is amaan for you....";
    }
}
