package com.thumb.mapper;
import java.math.BigDecimal;
import java.util.Date;
import com.thumb.dto.OmsCartItemDto;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.thumb.pojo.OmsCartItem;

public interface OmsCartItemMapper {
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