package com.thumb.mapper;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.OmsOrderItem;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);

    String findOneProductAttrByProductId(@Param("productId")Long productId);

}