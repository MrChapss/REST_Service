package com.example.restservice.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;

@ExtendWith(SpringExtension.class)
@WebMvcTest(GreetingController.class)
class GreetingControllerIntegrationTest {

    @Test
    void greeting() {
    }
}