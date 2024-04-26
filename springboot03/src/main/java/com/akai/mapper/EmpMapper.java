package com.akai.mapper;

import com.akai.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> selectAll();

    int deleteEmpById(Integer empno);
}
