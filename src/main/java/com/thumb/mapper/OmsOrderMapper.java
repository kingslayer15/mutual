package com.thumb.mapper;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.thumb.dto.OrderStatusDto;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.OmsOrder;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    Long countByCreateTime(@Param("starTime") Date starTime,@Param("endTime") Date endTime);


    BigDecimal findSumTotalAmountByStatusAndCreateTimeBetween(@Param("starTime")Date starTime,@Param("endTime")Date endTime);

    OmsOrder findById(@Param("id")Long id);

    List<OrderStatusDto> countByStatus();

    BigDecimal countByConfirm();


    BigDecimal countByReturnApply(@Param("status") Integer status);

























}