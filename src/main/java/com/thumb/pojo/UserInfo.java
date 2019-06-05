package com.thumb.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@ToString
public class UserInfo {

    BigInteger id;
    BigInteger member_level_id;
    String username;
    String password;
    String nickname;
    String phone;
    int status;
    Date create_time;
    String icon;
    int gender;
    Date birthday;
    String city;
    String job;
    String personalized_signature;
    int source_type;
    int integration;
    int growth;
    int luckey_count;
    int history_integration;




}
