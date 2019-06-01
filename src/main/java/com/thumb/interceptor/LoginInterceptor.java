package com.thumb.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by DELL on 2019/5/27.
 */
public class LoginInterceptor implements HandlerInterceptor{
    //前置
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

//        String uri = httpServletRequest.getRequestURI();
//        System.out.println(uri);
//        //1.拦截除请求地址login、reg两个页面及其后续处理程序的所有请求
//        //和filter不同，spring的拦截器只关注内容拦截
//        if(uri.equals("/login.html")||uri.equals("/reg.html")){
//            return true;
//        }
//        //2.如果有令牌，我就不拦截
//        UserInfo userInfo = (UserInfo)httpServletRequest.getSession().getAttribute("userInfo");
//        if(userInfo!=null){
//            return true;
//        }
//        return false;
        return true;
    }

    //请求处理
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //后置
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
