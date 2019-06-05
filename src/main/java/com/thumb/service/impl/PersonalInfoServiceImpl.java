package com.thumb.service.impl;

import com.thumb.dto.UserInfoDto;
import com.thumb.mapper.PersonalInfoMapper;
import com.thumb.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {
    @Autowired
    PersonalInfoMapper personalInfoMapper;

    public UserInfoDto userInfoById(int userId) {
        return personalInfoMapper.userInfoById(userId);
    }

    public int iconUpdate(UserInfoDto userInfoDto) {
        return personalInfoMapper.iconUpdate(userInfoDto);
    }

    public int updateInfo(UserInfoDto userInfoDto) {
        return personalInfoMapper.updateInfo(userInfoDto);
    }

    public UserInfoDto check(UserInfoDto userInfoDto) {
        return personalInfoMapper.check(userInfoDto);
    }

    public int pwdUpdate(UserInfoDto userInfoDto) {
        return personalInfoMapper.pwdUpdate(userInfoDto);
    }

}
