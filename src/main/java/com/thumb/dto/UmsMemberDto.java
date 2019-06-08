package com.thumb.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberDto {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
    /**
     * 注册邮箱
     */
    private String regemail;
    /**
     * 注册验证码
     */
    private String regCode;

    /**
     * 登录验证码
     */
    private String loginCode;



}
