package com.thumb.mapper;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.UmsMember;

import java.math.BigDecimal;
import java.util.Date;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    BigDecimal countByCreateTime(Integer dayNum);

    BigDecimal countByCreateTimeMonth();

    Long countAll();


}