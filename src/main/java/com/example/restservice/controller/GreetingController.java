package com.example.restservice.controller;

// service class which return in JSON form
import com.example.restservice.service.Greeting;
// to label the class as a controller
import org.springframework.web.bind.annotation.RestController;
// required to request to get the data
import org.springframework.web.bind.annotation.GetMapping;
// make the string as a query (for website to understand)
import org.springframework.web.bind.annotation.RequestParam;
// responsible for incrementing the id when requesting at the same controller
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
