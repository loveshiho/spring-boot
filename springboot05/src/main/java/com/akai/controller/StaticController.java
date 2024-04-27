package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StaticController {
    @RequestMapping("/hello.html")
    @ResponseBody
    public String hello() {
        return "ok";
    }
}
