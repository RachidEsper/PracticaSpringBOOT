package com.example.quickstartApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloWorldController {

    @PostMapping ("/hello")
    public String sayHello() {
        return "Hello Rachid!";
    }
}
