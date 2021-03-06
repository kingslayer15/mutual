package com.thumb.service.impl;

import com.thumb.dto.DateDto;
import com.thumb.dto.OrderStatusDto;
import com.thumb.pay.vo.AliPayInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.OmsOrder;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.service.OmsOrderService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Resource
    private OmsOrderMapper omsOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrder record) {
        return omsOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrder record) {
        return omsOrderMapper.insertSelective(record);
    }

    @Override
    public OmsOrder selectByPrimaryKey(Long id) {
        return omsOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal countByCreateTime(@Param("starTime") Date starTime, @Param("endTime") Date endTime){
        BigDecimal bigDecimal = omsOrderMapper.countByCreateTime(starTime, endTime);
        return bigDecimal;
    }

    @Override
    public BigDecimal findSumTotalAmountByStatusAndCreateTimeBetween(Date starTime, Date endTime) {
        BigDecimal totalAmount = omsOrderMapper.findSumTotalAmountByStatusAndCreateTimeBetween(starTime, endTime);

        return totalAmount;
    }

    @Override
    public List<OrderStatusDto> countByStatus() {
        List<OrderStatusDto> orderStatusDtos = omsOrderMapper.countByStatus();
        return orderStatusDtos;
    }

    @Override
    public BigDecimal countByConfirm() {

        BigDecimal bigDecimal = omsOrderMapper.countByConfirm();

        return bigDecimal;
    }


    @Override
    public BigDecimal countByReturnApply(Integer status) {

        BigDecimal bigDecimal = omsOrderMapper.countByReturnApply(status);

        return bigDecimal;
    }

    @Override
    public BigDecimal countOderByCreateTime(Integer dayNum) {
//        omsOrderMapper.countByCreateTime(dayNum);
        return null;
    }

    @Override
    public Date findFirstCreateTimeOrderByCreateTimeDesc() {
        Date firstCreateTimeOrderByCreateTimeDesc = omsOrderMapper.findFirstCreateTimeOrderByCreateTimeDesc();
        return firstCreateTimeOrderByCreateTimeDesc;
    }

    @Override
    public int insertVo(AliPayInfoVo aliPayInfoVo) {

        int i = omsOrderMapper.insertVo(aliPayInfoVo);
        return i;
    }

    @Override
    public Long selectOneIdByOrderSn(String orderSn) {
        Long id = omsOrderMapper.selectOneIdByOrderSn(orderSn);

        return id;
    }

    @Override
    public BigDecimal findTodayCount() {
        BigDecimal todayCount = omsOrderMapper.findTodayCount();
        return todayCount;
    }

    @Override
    public BigDecimal findTodayAmount() {
        BigDecimal todayAmount = omsOrderMapper.findTodayAmount();
        return todayAmount;
    }

    @Override
    public BigDecimal findThisMonthAmount() {
        BigDecimal thisMonthAmount = omsOrderMapper.findThisMonthAmount();
        return thisMonthAmount;
    }

    @Override
    public BigDecimal findThisMonthCount() {

        BigDecimal thisMonthCount = omsOrderMapper.findThisMonthCount();

        return thisMonthCount;
    }

    @Override
    public BigDecimal findThisWeekAmount() {
        BigDecimal thisWeekAmount = omsOrderMapper.findThisWeekAmount();
        return thisWeekAmount;
    }

    @Override
    public BigDecimal findThisWeekCount() {
        BigDecimal thisWeekCount = omsOrderMapper.findThisWeekCount();
        return thisWeekCount;
    }

    @Override
    public BigDecimal findLastDayAmount() {
        BigDecimal lastDayAmount = omsOrderMapper.findLastDayAmount();
        return lastDayAmount;
    }

    @Override
    public BigDecimal findLastMonthAmount() {
        BigDecimal lastMonthAmount = omsOrderMapper.findLastMonthAmount();
        return lastMonthAmount;
    }

//    @Override
//    public List<Object> selectByDate(String year, String month) {
//
////        Object   dateDtos = omsOrderMapper.selectByDate(year, month);
//        return "";
//    }


}
