package com.akai.config;

import com.akai.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * MyConfig配置类本身也是一个 spring容器中的 bean
 * proxyBeanMethods=true 属性，给 MyConfig对象产生一个代理对象
 * 通过代理对象控制反复调用 MyConfig里面的方法返回的是容器中的同一个单实例
 * 如果proxyBeanMethods=false 那么我们拿到的 MyConfig对象就不是一个代理对象，相当于是 new MyConfig();
 * 那么这个时候反复调用 MyConfig中的方法返回的就是多实例
 *
 * proxyBeanMethods=false 称之为 Lite模式  特点启动快
 * proxyBeanMethods=true  称之为 Full模式  特点依赖 spring容器控制 bean单例
 *
 */
public class MyConfig {
    /*<bean id = "user1" class ="com.akai.pojo.User">... ...</bean>*/
    @Bean  // 向容器中声明一个 Bean，以方法名作为 Bean的 id，返回值类型作为 Bean的 class
    public User user01() {
        return new User("cao", "shiho");
    }
}
