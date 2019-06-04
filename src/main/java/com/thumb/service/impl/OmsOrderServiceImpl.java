package com.thumb.service.impl;

import com.thumb.dto.OrderStatusDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.OmsOrder;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.service.AdminMainService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AdminMainServiceImpl implements AdminMainService {

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
    public Long countByCreateTime(@Param("starTime") Date starTime, @Param("endTime") Date endTime){
        Long aLong = omsOrderMapper.countByCreateTime(starTime, endTime);
        return aLong;
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
    public BigDecimal countByLowStock() {

        BigDecimal bigDecimal = omsOrderMapper.countByLowStock();

        return bigDecimal;
    }

    @Override
    public BigDecimal countByReturnApply(Integer status) {

        BigDecimal bigDecimal = omsOrderMapper.countByReturnApply(status);

        return bigDecimal;
    }

    @Override
    public BigDecimal countByEndTime() {

        BigDecimal bigDecimal = omsOrderMapper.countByEndTime();

        return bigDecimal;
    }

}
