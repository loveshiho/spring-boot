package com.akai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.akai.mapper") // 一劳永逸，扫描所有 mapper，而不用手动添加 @mapper
public class Springboot06Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06Application.class, args);
    }

}
