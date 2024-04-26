package com.akai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TlController {
    @RequestMapping("/firstShow")
    public String firstShow(Map<String, Object> model) {
        model.put("msg", "hello");
        return "index";
    }
}
