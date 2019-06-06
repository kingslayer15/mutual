package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class UserInfoDto {

    BigInteger id;
    BigInteger member_level_id;
    String username;
    String password;
    String newPassword;
    String nickname;
    String phone;
    int status;
    String create_time;
    String icon;
    int gender;
    String birthday;
    String city;
    String job;
    String personalized_signature;
    int source_type;
    int integration;
    int growth;
    int luckey_count;
    int history_integration;


}
