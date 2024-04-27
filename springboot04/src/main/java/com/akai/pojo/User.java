package com.akai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
/* prefix前缀，为配置文件中对应的前缀
 * 通过前缀找到对应的配置信息后，再根据属性名去注入匹配的数据*/
@ConfigurationProperties(prefix = "user")
public class User {
    private String name;
    private String password;
}
