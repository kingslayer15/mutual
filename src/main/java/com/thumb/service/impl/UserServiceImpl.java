package com.thumb.service.impl;

import com.thumb.mapper.UserMapper;
import com.thumb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

}
