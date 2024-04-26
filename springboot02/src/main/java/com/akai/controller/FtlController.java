package com.akai.controller;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FtlController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/showEmps")
    public ModelAndView showEmps() {
        ModelAndView mv = new ModelAndView();
        List<Emp> all = empService.findAll();
        Map<String, Object> model = mv.getModel();
        model.put("emps", all);
        mv.setViewName("showEmps");
        return mv;
    }
    @RequestMapping("/showEmpsMap")
    public ModelAndView showEmpsMap() {
        ModelAndView mv = new ModelAndView();
        List<Emp> all = empService.findAll();
        Map<String, Emp> empsMap = new HashMap<>();
        for (Emp emp : all) {
            empsMap.put(emp.getEmpno().toString(), emp);
        }
        mv.addObject("empsMap", empsMap);
        mv.setViewName("showEmpsMap");
        return mv;
    }
    @RequestMapping("/show")
    public String freemarker(Map<String, Object> model) {
        model.put("name", "shiho");
        return "show";  // 模版的默认位置在 templates下，后缀名为 .ftlh
    }
}
