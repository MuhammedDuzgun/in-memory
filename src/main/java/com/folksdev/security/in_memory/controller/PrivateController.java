package com.folksdev.security.in_memory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloWorld() {
        return "Hello World ! from private endpoint";
    }

    @GetMapping("/user")
    public String helloWorldUser() {
        return "Hello world private - USER";
    }

    @GetMapping("/admin")
    public String helloWorldAdmin() {
        return "Hello world private - ADMIN";
    }

}
