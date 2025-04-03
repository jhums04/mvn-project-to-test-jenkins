package com.example.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
 class HelloControllerTest {

    private HelloControlelr helloController;

    @BeforeEach
    void setUp() {
        helloController = new HelloControlelr();
    }

    @Test
    void testSayHello() {
        String response = helloController.sayHello();
        assertEquals("Hiiiiiiiiiii", response, "The greeting should be 'Hiiiiiiiiiii'");
    }
}