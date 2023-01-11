package com.example.test_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping
    public String root() {
        return "root";
    }

    @GetMapping("/get")
    public String get() {
        return "get";
    }
}
