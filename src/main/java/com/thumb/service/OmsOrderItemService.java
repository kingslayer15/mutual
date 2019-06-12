package com.thumb.service;

import com.thumb.pojo.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderItemService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);

    String findOneProductAttrByProductId(Long productId);

}
