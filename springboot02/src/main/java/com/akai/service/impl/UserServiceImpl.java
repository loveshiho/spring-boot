package com.akai.service.impl;

import com.akai.mapper.UserMapper;
import com.akai.pojo.User;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service    // 声明bean的注解要加在实现类上！😹
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAll();
    }
}
