package com.akai;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03ApplicationTests {
    @Autowired
    private EmpService empService;

    @Test
    void contextLoads() {
        List<Emp> all = empService.findAll();
        all.forEach(System.out::println);
    }
}
