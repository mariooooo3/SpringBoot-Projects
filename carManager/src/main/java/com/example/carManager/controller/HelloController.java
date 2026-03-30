package com.example.carManager.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello Car Manager! Nice to see you again!!";
    }
}
