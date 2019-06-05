package com.thumb.controller;

import com.thumb.pojo.UmsMember;
import com.thumb.service.UmsMemberService;
import com.thumb.utility.email.CodeUtils;
import com.thumb.utility.email.SendEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UmsMemberController {

    @Autowired
    UmsMemberService umsMemberService;


    /**
     * @param regEmail 获取注册邮箱验证码
     */
    @RequestMapping("getValidCode")
    @ResponseBody
    public String getValidCode(@RequestParam String regEmail, HttpSession httpSession) {
        //获取用户注册email
        System.out.println(regEmail);
        String toEmail=regEmail;
        String code = null;
        CodeUtils codeUtils = new CodeUtils();
        code = codeUtils.generateUniqueCode();
        System.out.println(code);
        //把code存入session
        httpSession.setAttribute("code",code);


        try {
            //把code发送给用户
            SendEmailUtil.send_email(toEmail, code);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return code;
    }

    @RequestMapping("regMember")
    @ResponseBody
    public String regMember(@RequestBody UmsMember umsMember,HttpSession httpSession) {
        System.out.println(umsMember);
        //从session取code
        String code = (String) httpSession.getAttribute("code");
        System.out.println("session拿到"+code);

        //从前端拿到code
        String regCode = umsMember.getRegCode();
        System.out.println("前端"+regCode);
        //比较code
        if (code.equals(regCode)) {
            System.out.println("code对比成功");
            boolean i = umsMemberService.insert(umsMember);
            System.out.println(i);
        }
        System.out.println("code对比失败");
        return code;

    }


}
