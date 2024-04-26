package com.akai.controller;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
        int i = 1 / 0;
        List<Emp> all = empService.findAll();
        model.put("emps", all);
        model.put("emp", all.get(0));
        return "showEmps";
    }

    @RequestMapping("/removeEmp")
    public String removeEmp(Integer empno) {
        int i = empService.deleteEmpById(empno);
        return "forward:showEmps";
        // return "forward:showEmps.html";
    }
    @RequestMapping("/showIndex")
    public String showIndex(HttpServletRequest req, HttpSession session) {
        // 向request域放数据
        req.setAttribute("msg", "requestMessage");
        // 向session域放数据
        session.setAttribute("msg", "sessionMessage");
        // 向application域放数据
        req.getServletContext().setAttribute("msg", "applicationMessage");
        return "index";
    }
}
