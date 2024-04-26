package com.akai.controller;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class TlController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/firstShow")
    public String firstShow(Map<String, Object> model) {
        model.put("msg", "hello");
        return "index";
    }
    @RequestMapping("/showEmps")
    public String showEmps(Map<String, Object> model) {
        List<Emp> all = empService.findAll();
        model.put("emps", all);
        model.put("emp",all.get(0));
        return "showEmps";
    }
    @RequestMapping("/removeEmp")
    public String removeEmp(Integer empno) {
        int i = empService.deleteEmpById(empno);
        return "forward:showEmps";
        // return "forward:showEmps.html";
    }

}
