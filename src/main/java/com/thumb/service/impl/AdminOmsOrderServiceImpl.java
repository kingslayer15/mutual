package com.thumb.service.impl;

import com.thumb.entity.dto.*;
import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import com.thumb.entity.pojo.OmsOrderReturnReason;
import com.thumb.entity.pojo.OmsOrderSetting;
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
     * 根据查询条件查询订单信息
     * @param searchOmsOrder
     * @return
     */
    @Override
    public List<OmsOrder> searchOmsOrder(SearchOmsOrder searchOmsOrder) {
        return adminOmsOrderMapper.searchOmsOrder(searchOmsOrder);
    }

    /**
     * 根据订单的id获取订单详情
     * @param omsOrderId
     * @return
     */
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
//        System.out.println("service");
//        System.out.println(omsOrderId);
//        int i = 0;
//        i += adminOmsOrderMapper.deleteOmsOrderById(omsOrderId);
//        System.out.println(i);
//        i += adminOmsOrderMapper.deleteOmsOrderItemByOrderId(omsOrderId);
//        System.out.println(i);
//        return i;
        return adminOmsOrderMapper.deleteOmsOrderById(omsOrderId)+adminOmsOrderMapper.deleteOmsOrderItemByOrderId(omsOrderId);
    }

    /**
     * 获取订单的设置内容
     * @return
     */
    @Override
    public OmsOrderSetting getOmsOrderSetting() {
        return adminOmsOrderMapper.getOmsOrderSetting();
    }

    /**
     * 修改订单的设置内容
     * @param updateOmsOrderSetting
     * @return
     */
    @Override
    public int updateOmsOrderSetting(UpdateOmsOrderSetting updateOmsOrderSetting) {
        return adminOmsOrderMapper.updateOmsOrderSetting(updateOmsOrderSetting);
    }

    /**
     * 查询所有的退货申请
     * @return
     */
    @Override
    public List<OmsOrderReturnApply> listAllOmsOrderReturnApply() {
        return adminOmsOrderMapper.listAllOmsOrderReturnApply();
    }

    /**
     * 根据查询条件筛选退货申请信息
     * @param searchApply
     * @return
     */
    @Override
    public List<OmsOrderReturnApply> searchOmsOrderReturnApply(SearchOmsOrderReturnApply searchApply) {
        System.out.println(searchApply);
        return adminOmsOrderMapper.searchOmsOrderReturnApply(searchApply);
    }

    /**
     * 根据退货id（服务单号）查询订单详情
     * @param id
     * @return
     */
    @Override
    public OmsOrderReturnApply showOmsOrderReturnApplyById(int id) {
        return adminOmsOrderMapper.showOmsOrderReturnApplyById(id);
    }


    /**
     * 查询所有退货原因
     * @return
     */
    @Override
    public List<OmsOrderReturnReason> listAllReturnReason() {
        return adminOmsOrderMapper.listAllReturnReason();
    }

    /**
     * 添加一个退货原因
     * @return
     */
    @Override
    public int insertReturnReason(UpdateReturnReason updateReturnReason) {
        return adminOmsOrderMapper.insertReturnReason(updateReturnReason);
    }

    /**
     * 修改一个退货原因
     * @return
     */
    @Override
    public int updateReturnReason(UpdateReturnReason updateReturnReason) {
        return adminOmsOrderMapper.updateReturnReason(updateReturnReason);
    }

    /**
     * 删除一个退货原因
     * @return
     */
    @Override
    public int deleteReturnReason(int id) {
        return adminOmsOrderMapper.deleteReturnReason(id);
    }

    @Override
    public int updateOmsOrderStatusByOrderId(UpdateStatus updateStatus) {
        return adminOmsOrderMapper.updateOmsOrderStatusByOrderId(updateStatus);
    }

    @Override
    public int updateReturnApplyStatusById(UpdateStatus updateStatus) {
        return adminOmsOrderMapper.updateReturnApplyStatusById(updateStatus);
    }

    @Override
    public int updateReturnReasonStatus(UpdateStatus updateStatus) {
        return adminOmsOrderMapper.updateReturnReasonStatus(updateStatus);
    }
}
