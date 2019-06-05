package com.thumb.service;

import com.thumb.dto.UserInfoDto;

public interface PersonalInfoService {
    UserInfoDto userInfoById(int userId);

    int iconUpdate(UserInfoDto userInfoDto);

    int updateInfo(UserInfoDto userInfoDto);

    UserInfoDto check(UserInfoDto userInfoDto);

    int pwdUpdate(UserInfoDto userInfoDto);
}
