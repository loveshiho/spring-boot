package com.akai;

import com.akai.pojo.Dept;
import com.akai.service.DeptService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // 要想依赖 springboot的环境，就得加上该注解，也就是使用 springboot的容器功能
class Springboot06ApplicationTests2 {
    @Autowired
    public DeptService deptService;
}
