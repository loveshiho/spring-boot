package com.akai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 启动类
// 可以自动扫描当前类所在包及子包的注解
// 注意：此类要放入到包中和 controller包同一个层次即可
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
