package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnoController {
    @RequestMapping("/sayhi")
    public String sayhi() {
        System.out.println("ha ha");
        return "hello";
    }
}
