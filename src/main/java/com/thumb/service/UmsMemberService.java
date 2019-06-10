package com.thumb.service;
import java.util.List;

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

    UmsMember selectOneByUsernameAndPassword(UmsMemberDto umsMemberDto);

	UmsMember selectOneByUsername(String username);

	UmsMember selectOneByRegemail(String regemail);













    BigDecimal countByCreateTime(Integer dayNum);

    BigDecimal countByCreateTimeMonth();

    Long countAll();


}
