package com.thumb.controller;

import com.thumb.pojo.UmsAdmin;
import com.thumb.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UmsAdminController {
    @Autowired
    UmsAdminService umsAdminService;

    /**
     * 后台登录存session
     * @param umsAdmin
     * @param httpSession
     * @return
     */
    @RequestMapping("backLoginController")
    @ResponseBody
    public Object backLoginController(@RequestBody UmsAdmin umsAdmin, HttpSession httpSession) {
        System.out.println(umsAdmin);
        UmsAdmin admin = umsAdminService.selectOnebyall(umsAdmin);
        System.out.println(admin);
        if (admin != null) {
            System.out.println("管理员登录成功");
            httpSession.setAttribute("admin", admin);
            return true;
        } else {
            System.out.println("管理员登录失败");
            return false;
        }

    }

}