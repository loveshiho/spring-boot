package com.akai.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private Interceptor interceptor;
    /*@Autowired
    private Interceptor2 interceptor2;*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // InterceptorRegistration interceptorRegistration = registry.addInterceptor(interceptor);
        // 注册多个 interceptor
        // registry.addInterceptor(interceptor2);
        // InterceptorRegistration interceptorRegistration1 = interceptorRegistration.addPathPatterns("/**");
        // 我们会发现 addPathPatterns的返回值类型也是 InterceptorRegistration 那么编码就可以简化
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
