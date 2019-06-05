package com.thumb.service;

import com.thumb.controller.UmsMemberController;
import com.thumb.service.UserService;
import com.thumb.service.impl.UmsMemberServiceImpl;
import com.thumb.service.impl.UserServiceImpl;
import org.junit.Test;

public class TestEmail {
    @Test
    public void sendEmail() {
        UmsMemberServiceImpl umsMemberService = new UmsMemberServiceImpl();
        umsMemberService.sendEmail("newwaylau@163.com");
    }
}
