package com.thumb.service;

import com.thumb.dto.DateDto;
import com.thumb.dto.OrderStatusDto;
import com.thumb.pay.vo.AliPayInfoVo;
import com.thumb.pojo.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OmsOrderService {


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    BigDecimal countByCreateTime(@Param("starTime") Date starTime,@Param("endTime") Date endTime);

    BigDecimal findSumTotalAmountByStatusAndCreateTimeBetween(@Param("starTime")Date starTime, @Param("endTime")Date endTime);

    List<OrderStatusDto> countByStatus();

    BigDecimal countByConfirm();


    BigDecimal countByReturnApply(Integer status);

    BigDecimal countOderByCreateTime(Integer dayNum);

    Date findFirstCreateTimeOrderByCreateTimeDesc();

    int insertVo(AliPayInfoVo aliPayInfoVo);

    Long selectOneIdByOrderSn(String orderSn);

//    List<Object> selectByDate(String year, String month);

    BigDecimal findTodayAmount();

    BigDecimal findThisMonthAmount();

    BigDecimal findThisMonthCount();


}
