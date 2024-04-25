package com.akai.service.impl;

import com.akai.mapper.EmpMapper;
import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.selectAll();
    }

    @Override
    public List<Emp> findByPage(Integer pageNum, Integer pageSize) {
        Page<Emp> page = PageHelper.startPage(pageNum, pageSize);   // 这就是加的那行代码😹so cool~
        List<Emp> emps = empMapper.selectAll();     // 注意查询要紧跟着 startPage方法
        // 我们需要给前端返回的数据：页码  页大小  当前页数据  总页数  总记录数
        // 方式一
        System.out.println("当前页:" + page.getPageNum());
        System.out.println("总页数" + page.getPages());
        System.out.println("页大小:" + page.getPageSize());
        System.out.println("总记录数:" + page.getTotal());
        System.out.println("当前页数据" + page.getResult());
        // 方式二
        // 我们并不推荐直接使用 Page对象，而是对 Page对象进行转化
        // PageInfo >>> PageBean
        PageInfo<Emp> pi = new PageInfo<>(emps);    // 注意：findAll查询出来的 emps本质上就是 page   page.getResult() == emps
        System.out.println("当前页" + pi.getPageNum());
        System.out.println("总页数" + pi.getPages());
        System.out.println("页大小" + pi.getSize());
        System.out.println("总记录数" + pi.getTotal());
        System.out.println("当前页数据" + pi.getList());
        return emps;
    }
}
