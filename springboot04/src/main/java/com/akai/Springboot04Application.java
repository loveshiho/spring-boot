package com.akai;

import com.akai.config.MyConfig;
import com.akai.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class Springboot04Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot04Application.class, args);    // context就是容器 applicationContext
        // 获取容器中的 Bean
        User user01 = context.getBean("user01", User.class);
        System.out.println(user01);  // User(name=cao, password=shiho)
        User user02 = context.getBean("user01", User.class);
        System.out.println(user01 == user02);   // true
        // 获取 spring中默认已经声明的 Bean
        /*String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        // 另一种获取 Config中 Bean的方式
        // 用容器获取 MyConfig对象获取的是 MyConfig的代理对象
        User user1 = context.getBean(MyConfig.class).user01();
        User user2 = context.getBean(MyConfig.class).user01();
        System.out.println(user1 == user2);  // true
    }

}
