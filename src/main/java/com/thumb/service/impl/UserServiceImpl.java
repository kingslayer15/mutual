package com.thumb.service.impl;

import com.thumb.mapper.UserMapper;
import com.thumb.service.UserService;
import com.thumb.utility.email.CodeUtils;
import com.thumb.utility.email.SendEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


}
