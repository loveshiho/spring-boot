package com.akai.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果登录过就放行
        Object name = request.getSession().getAttribute("name");
        if (name != null) {
            return true;
        }
        // 如果没登录过，那么就回到登录页，重定向
        response.sendRedirect("login.html");
        return false;
    }
}
