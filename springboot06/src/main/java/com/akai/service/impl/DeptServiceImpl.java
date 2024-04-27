package com.akai.service.impl;

import com.akai.mapper.DeptMapper;
import com.akai.pojo.Dept;
import com.akai.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
