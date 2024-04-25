package com.akai.controller;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Emp> findAll() {
        List<Emp> emps = empService.findAll();
        return emps;
    }

    @ResponseBody
    @RequestMapping("/findByPage/{pageNum}/{pageSize}") // 当前页、页大小
    public List<Emp> findByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        List<Emp> emps = empService.findByPage(pageNum, pageSize);
        return emps;
    }
}
