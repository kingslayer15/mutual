package com.thumb.service;

import com.thumb.pojo.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface OmsOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    Long countByCreateTime(@Param("starTime") Date starTime,@Param("endTime") Date endTime);

}
