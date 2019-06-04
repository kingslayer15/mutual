package com.thumb.service.impl;

import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.OmsOrder;
import com.thumb.mapper.AdminOmsOrderMapper;
import com.thumb.service.AdminOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminOmsOrderServiceImpl implements AdminOmsOrderService {

    @Autowired
    AdminOmsOrderMapper adminOmsOrderMapper;

    /**
     * 管理员查询数据库中所有的订单信息
     * @return
     */
    @Override
    public List<OmsOrder> listAllOmsOrderByAdmin() {
        return adminOmsOrderMapper.listAllOmsOrderByAdmin();
    }

    /**
     * 根据查询条件所选订单信息
     * @param searchOmsOrder
     * @return
     */
    @Override
    public List<OmsOrder> searchOmsOrder(SearchOmsOrder searchOmsOrder) {
        return adminOmsOrderMapper.searchOmsOrder(searchOmsOrder);
    }


    @Override
    public OmsOrder getOmsOrderById(int omsOrderId) {
        return adminOmsOrderMapper.getOmsOrderById(omsOrderId);
    }

    /**
     * 根据订单id删除订单信息和具体的订单信息
     * @param omsOrderId
     * @return
     */
    @Override
    public int deleteOmsOrderById(int omsOrderId) {
        return adminOmsOrderMapper.deleteOmsOrderById(omsOrderId);
    }
}
