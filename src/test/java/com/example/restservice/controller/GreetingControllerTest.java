package com.example.restservice.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    // UNIT TEST - NO SPRING INVOLVE
    @Test
    void checkAge(){
        var checkingAge = new GreetingController(); // arrange
        String result = checkingAge.minor(19); // act
        assertEquals("18+", result); // assert
    }
}