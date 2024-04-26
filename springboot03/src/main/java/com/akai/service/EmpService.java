package com.akai.service;

import com.akai.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();

    int deleteEmpById(Integer empno);
}
