package com.akai.controller;

import com.akai.pojo.User;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    @ResponseBody
    public List<User> findAllUser() {
        List<User> users = userService.findAllUser();
        return users;
    }
}
