package com.example.lambda.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lambda/hello")
public class HelloController {
    @GetMapping
    public String get(@RequestParam(required = false) Map<String, String> params) {  
        return "Hello: " + params;
    }

    @PostMapping
    public String post(@RequestBody(required = false) String entity) {
        return entity.toUpperCase();
    }
}
