package com.akai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/testSpringBoot")
    public String testSpringBoot() {
        return "hello spring~";
    }
}
