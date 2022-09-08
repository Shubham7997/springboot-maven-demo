package com.awsproject.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    String home() {
        return "Spring Boot Application is running successfully!";
    }
}
