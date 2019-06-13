package com.thumb.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.thumb.dto.UmsMemberDto;
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

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class UmsMemberController {

    @Autowired
    UmsMemberService umsMemberService;
    @Autowired
    private Producer captchaProducer = null;



    /**
     * @param regEmail 获取注册邮箱验证码
     */
    @RequestMapping("getValidCode")
    @ResponseBody
    public void getValidCode(@RequestParam String regEmail, HttpSession httpSession) {
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
    }


    /**
     * 注册用户
     * @param umsMember
     * @return
     */
    @RequestMapping("regMember")
    @ResponseBody
    public boolean regMember(@RequestBody UmsMember umsMember) {
        boolean i = umsMemberService.insert(umsMember);
        System.out.println(i);
        return true;
    }
    /**
     * 登录验证码生成
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("captchaController")
    public String getKaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        String capText = captchaProducer.createText();
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        String code = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println("code生成"+code);
        return code;
    }

    /**
     * 注册用户,根据名字判断是否重名
     * @param username
     * @return
     */
    @RequestMapping("isExistUsername")
    @ResponseBody
    public boolean isExistUsername(@RequestParam String username) {
        System.out.println(username);
        UmsMember umsMember = umsMemberService.selectOneByUsername(username);
        System.out.println(umsMember);
        if (umsMember != null) {
            //如果用户名存在返回false,前端的messages里的remote才识别
            return false;
        }
        return true;
    }

    /**
     *      * 注册用户,根据邮箱名判断是否重名
     * @param regemail
     * @return
     */
    @RequestMapping("isExistRegEmail")
    @ResponseBody
    public boolean isExistRegEmail(@RequestParam String regemail) {
        System.out.println(regemail);
        UmsMember umsMember = umsMemberService.selectOneByRegemail(regemail);
        System.out.println(umsMember);
        if (umsMember != null) {
            return false;
        }
        return true;

    }

    /**
     * 注册用户,前后端验证码比较,成功则true
     * @param regcode
     * @param httpSession
     * @return
     */
    @RequestMapping("isExistRegCode")
    @ResponseBody
    public boolean isExistRegCode(@RequestParam String regcode,HttpSession httpSession) {
        System.out.println(regcode);
        String code = (String) httpSession.getAttribute("code");
        if (!regcode.equals(code)) {
            return false;
        }
        return true;

    }

    /**
     * 登录时候判断验证码是否一致
     * @param logincode
     * @param httpSession
     * @return
     */
    @RequestMapping("isExistLoginCode")
    @ResponseBody
    public boolean isExistLoginCode(@RequestParam String logincode,HttpSession httpSession) {
        System.out.println(logincode);
        String KAPTCHACode = (String) httpSession.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (!logincode.equals(KAPTCHACode)) {
            return false;
        }
        return true;
    }


    /**
     * 登录的时候根据用户名密码登录
     * @param umsMemberDto
     * @return
     */
    @RequestMapping("userLogin")
    @ResponseBody
    public boolean userLogin(@RequestBody UmsMemberDto umsMemberDto,HttpSession httpSession) {
        System.out.println(umsMemberDto);
        //去后台查询用户名和密码
        UmsMember umsMember = umsMemberService.selectOneByUsernameAndPassword(umsMemberDto);
        System.out.println(umsMember);
        if (umsMember != null) {
            httpSession.setAttribute("umsMember",umsMember);
            return true;
        }
        return false;
    }
}
