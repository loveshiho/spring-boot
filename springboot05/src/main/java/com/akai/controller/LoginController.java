package com.akai.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String name, HttpSession session) {
        if (name != null && name != "") {
            session.setAttribute("name", name);
            return "redirect:welcome.html";
        }
        return "redirect:login.html";
    }
}
