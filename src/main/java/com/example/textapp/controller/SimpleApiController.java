package com.example.textapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SimpleApiController {

    @GetMapping("/api/simple/test")
    public Map<String, String> test() {
        return Map.of("status", "ok");
    }
}