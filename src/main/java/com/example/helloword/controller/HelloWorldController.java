package com.example.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping
    public Map<String,String > helloword(){
        return Map.of("status","200","response","success");
    }
}
