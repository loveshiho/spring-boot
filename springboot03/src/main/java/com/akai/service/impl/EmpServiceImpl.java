package com.akai.service.impl;

import com.akai.mapper.EmpMapper;
import com.akai.pojo.Emp;
import com.akai.service.EmpService;
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
    public int deleteEmpById(Integer empno) {
        return empMapper.deleteEmpById(empno);
    }
}
