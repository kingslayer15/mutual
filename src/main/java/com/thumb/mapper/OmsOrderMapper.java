package com.thumb.mapper;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import com.thumb.dto.DateDto;
import com.thumb.dto.OrderStatusDto;
import com.thumb.pay.vo.AliPayInfoVo;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.OmsOrder;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    BigDecimal countByCreateTime(@Param("starTime") Date starTime,@Param("endTime") Date endTime);


    BigDecimal findSumTotalAmountByStatusAndCreateTimeBetween(@Param("starTime")Date starTime,@Param("endTime")Date endTime);

    OmsOrder findById(@Param("id")Long id);

    List<OrderStatusDto> countByStatus();

    BigDecimal countByConfirm();


    BigDecimal countByReturnApply(@Param("status") Integer status);

    BigDecimal countOderByCreateTime(Integer dayNum);

    Date findFirstCreateTimeOrderByCreateTimeDesc();


    int insertVo(AliPayInfoVo aliPayInfoVo);



    Long selectOneIdByOrderSn(@Param("orderSn")String orderSn);

    List<DateDto> selectByDate(@Param("year") String year,@Param("month") String month);

    BigDecimal findTodayCount();

    BigDecimal findTodayAmount();

    BigDecimal findThisMonthAmount();

    BigDecimal findThisMonthCount();

    BigDecimal findThisWeekAmount();

    BigDecimal findThisWeekCount();

    BigDecimal findLastDayAmount();

    BigDecimal findLastMonthAmount();













}