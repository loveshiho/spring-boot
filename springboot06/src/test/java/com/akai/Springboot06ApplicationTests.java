package com.akai;

import com.akai.pojo.Dept;
import com.akai.service.DeptService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Test
    public void testQueryWrapper() {
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        // QueryWrapper 作用就是在原本的 SQL语句后面拼接 where条件
        qw.ge("deptno", 20).eq("dname", "ACCOUNTING").likeRight("dname", "A");
        List<Dept> list = deptService.list(qw);
        list.forEach(System.out::println);
    }

    @Test
    public void testQueryWrapper2() {
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.eq("deptno", 20);
        Dept dept = deptService.getOne(qw);
        System.out.println(dept);
    }

    @Test
    public void testAdd() {
        deptService.save(new Dept(null, "Java", "xian"));
    }

    @Test
    public void testUpdate() {
        Dept dept = new Dept();
        dept.setDname("Spring");
        dept.setLoc("shiho");
        // 更新的条件
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.eq("deptno", 44);
        deptService.update(dept, qw);
    }

    @Test
    public void testRemove() {
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.eq("deptno", 44);
        deptService.remove(qw);
    }

    // 测试分页
    @Test
    public void testPage() {
        // 页码数、页大小
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.likeRight("dname", "A");
        Page<Dept> page = deptService.page(new Page<>(1, 2), qw);
        // 当前页数据  总页数  总记录数  当前页  页大小 ... ..
        List<Dept> records = page.getRecords();
        records.forEach(System.out::println);
        System.out.println("总页数:" + page.getPages());
        System.out.println("总记录数:" + page.getTotal());
        System.out.println("当前页:" + page.getCurrent());
        System.out.println("页大小:" + page.getSize());
    }
}
