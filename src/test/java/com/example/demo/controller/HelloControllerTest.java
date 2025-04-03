package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    @InjectMocks
    HelloControlelr controlelr;

    @Test
    void helloTest() {
        String expected = "Hiiiiiiiiiii";
        assertEquals(expected, controlelr.sayHello());

    }

}