package com.akai.mapper;

import com.akai.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
