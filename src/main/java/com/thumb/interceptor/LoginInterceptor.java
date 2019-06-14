package com.thumb.interceptor;


import com.thumb.entity.pojo.UmsMember;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by DELL on 2019/5/27.
 */
public class LoginInterceptor implements HandlerInterceptor{
    //前置
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {


        String uri = httpServletRequest.getRequestURI();

        HttpSession session = httpServletRequest.getSession();

        UmsMember umsMember = (UmsMember) session.getAttribute("umsMember");
        Object admin = session.getAttribute("admin");
        Object merchant = session.getAttribute("merchant");

        if (umsMember != null || admin != null || merchant != null || uri.equals("/main/login.html")||uri.equals("/main/register.html")) {


            return true;
        }

        return false;
    }

    //请求处理
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //后置
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
