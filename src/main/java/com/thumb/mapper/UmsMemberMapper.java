package com.thumb.mapper;

import com.thumb.dto.UmsMemberDto;
import com.thumb.pojo.UmsMember;

import java.math.BigDecimal;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    /**
     * @param umsMemberDto 注册会员,插入用户名,密码,邮箱
     * @return
     */
    int insertReg(UmsMemberDto umsMemberDto);

    BigDecimal countByCreateTime(Integer dayNum);

    BigDecimal countByCreateTimeMonth();

    Long countAll();


}