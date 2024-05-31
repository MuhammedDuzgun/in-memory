package com.folksdev.security.in_memory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

     @GetMapping
    public String helloWorld() {
        return "HelloWorld ! from public endpoint" ;
    }

}