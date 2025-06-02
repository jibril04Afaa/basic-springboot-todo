package com.jibby.springboottodo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String sayHi() {
        return "Welcome to the Spring Boot todo project!";
    }
}
