package com.thumb.service;

import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.OmsCartItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsCartItemService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);

    List<OmsCartItem> findByMemberId(@Param("memberId")Long memberId);
    int insertCart(OmsCartItemDto omsCartItemDto);



	OmsCartItem selectOneByAll(OmsCartItemDto omsCartItemDto);







}
