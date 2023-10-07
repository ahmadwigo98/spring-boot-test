package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to Springboot Application Test";
    }

}
