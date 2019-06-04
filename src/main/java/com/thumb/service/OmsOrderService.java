package com.thumb.service;

import com.thumb.dto.OrderStatusDto;
import com.thumb.pojo.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface OmsOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    Long countByCreateTime(@Param("starTime") Date starTime,@Param("endTime") Date endTime);

    BigDecimal findSumTotalAmountByStatusAndCreateTimeBetween(@Param("starTime")Date starTime, @Param("endTime")Date endTime);

    List<OrderStatusDto> countByStatus();

    BigDecimal countByConfirm();

    BigDecimal countByLowStock();

    BigDecimal countByReturnApply();


}
