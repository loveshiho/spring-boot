package com.akai;

import com.akai.pojo.Dept;
import com.akai.service.DeptService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06ApplicationTests {

    @Autowired
    public DeptService deptService;
    @Test
    public void testFindAll() {
        List<Dept> list = deptService.list();
        list.forEach(System.out::println);
    }

}
