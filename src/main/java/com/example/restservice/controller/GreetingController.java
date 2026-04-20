package com.example.restservice.controller;

import com.example.restservice.service.Greeting;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    // my version of doing the project
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam (defaultValue="Skibidi") String name){
        return new Greeting(1,name);
    }
    // version based on official spring guide
    /* the difference of between my work and the snippet,
     the id is incrementing by 1 everytime you send GET request in this particular endpoint */
    @GetMapping("/greeting2")
    public Greeting greeting2(@RequestParam (defaultValue = "Sigma") String name){
        return new Greeting(counter.incrementAndGet(),
                template.formatted(name));
    }
}
