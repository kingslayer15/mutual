package com.thumb.mapper;

import com.thumb.dto.UserInfoDto;

public interface PersonalInfoMapper {

    UserInfoDto userInfoById(int userId);

    int iconUpdate(UserInfoDto userInfoDto);

    int updateInfo(UserInfoDto userInfoDto);

    UserInfoDto check(UserInfoDto userInfoDto);

    int pwdUpdate(UserInfoDto userInfoDto);
}
