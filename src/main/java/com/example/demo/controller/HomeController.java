package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/message")
    public String message() {
        return "Hello from Spring Boot Backend";
    }
}