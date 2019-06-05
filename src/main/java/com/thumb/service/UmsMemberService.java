package com.thumb.service;

import com.thumb.dto.UmsMemberDto;
import com.thumb.pojo.UmsMember;

import java.math.BigDecimal;

public interface UmsMemberService{


    int deleteByPrimaryKey(Long id);

    boolean insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);


    /**
     * @param regEmail 发送注册验证码给会员
     */
    void sendEmail(String regEmail);

    boolean insertReg(UmsMemberDto umsMemberDto);

    BigDecimal countByCreateTime(Integer dayNum);

    BigDecimal countByCreateTimeMonth();

    Long countAll();


}
