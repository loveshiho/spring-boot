package com.akai.config;

import com.akai.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/* 开启了 User属性自动配置功能并把 User自动注册到容器中
 * 这个时候，我们的 User上就不用加 @Component注解了
 * 适用于 Bean来自于第三方JAR场景
 * */
@Configuration
@EnableConfigurationProperties(User.class)
public class UserConfig {

}
