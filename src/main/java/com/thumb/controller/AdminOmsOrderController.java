package com.thumb.controller;

import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.dto.SearchOmsOrderReturnApply;
import com.thumb.entity.dto.UpdateOmsOrderSetting;
import com.thumb.entity.dto.UpdateReturnReason;
import com.thumb.entity.pojo.*;
import com.thumb.mapper.AdminOmsOrderMapper;
import com.thumb.service.AdminOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class AdminOmsOrderController {

    @Autowired
    AdminOmsOrderService adminOmsOrderService;

    /**
     * 管理员查询数据库中所有的订单信息
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllOmsOrderByAdmin")
    public List<OmsOrder> listAllOmsOrderByAdmin() {
        List<OmsOrder> omsOrders = adminOmsOrderService.listAllOmsOrderByAdmin();
//        for (OmsOrder omsOrder : omsOrders) System.out.println(omsOrder);
        return omsOrders;
    }

    /**
     * 根据查询条件查询订单信息
     * @param searchOmsOrder
     * @return
     */
    @ResponseBody
    @RequestMapping("searchOmsOrder")
    public List<OmsOrder> searchOmsOrder(@RequestBody SearchOmsOrder searchOmsOrder) {
        List<OmsOrder> omsOrderLists = adminOmsOrderService.searchOmsOrder(searchOmsOrder);
        System.err.println(searchOmsOrder);
        System.err.println(omsOrderLists);
        return omsOrderLists;
    }

    /**
     * 根据订单的id获取订单详情
     * @param omsOrderId
     * @return
     */
    @ResponseBody
    @RequestMapping("showOmsOrderById")
    public OmsOrder showOmsOrderById(@RequestParam int omsOrderId) {
        System.err.println("showOmsOrderById = " + omsOrderId);
        OmsOrder omsOrder = adminOmsOrderService.getOmsOrderById(omsOrderId);
        System.out.println(omsOrder);
        return omsOrder;
    }

    /**
     * 根据订单id删除该订单的信息
     * @param omsOrderId
     * @return
     */
    @RequestMapping("deleteOmsOrderById")
    public Object deleteOmsOrderById(@RequestParam int omsOrderId) {
        int i = adminOmsOrderService.deleteOmsOrderById(omsOrderId);
        return i;
    }

    /**
     * 获取订单的设置内容
     * @return
     */
    @ResponseBody
    @RequestMapping("getOmsOrderSetting")
    public Object getOmsOrderSetting() {
        OmsOrderSetting omsOrderSetting = adminOmsOrderService.getOmsOrderSetting();
        System.out.println(omsOrderSetting);
        return omsOrderSetting;
    }

    /**
     * 修改订单的设置内容
     * @param updateOmsOrderSetting
     * @return
     */
    @ResponseBody
    @RequestMapping("updateOmsOrderSetting")
    public Object updateOmsOrderSetting(@RequestBody UpdateOmsOrderSetting updateOmsOrderSetting) {
        System.out.println(updateOmsOrderSetting);
        int i = adminOmsOrderService.updateOmsOrderSetting(updateOmsOrderSetting);
        return i;
    }

    /**
     * 查询所有的退货申请
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllOmsOrderReturnApply")
    public Object listAllOmsOrderReturnApply() {
        List<OmsOrderReturnApply> omsOrderReturnApplies = adminOmsOrderService.listAllOmsOrderReturnApply();
        return omsOrderReturnApplies;
    }

    /**
     * 根据查询条件所选退货申请信息
     * @param searchApply
     * @return
     */
    @ResponseBody
    @RequestMapping("searchOmsOrderReturnApply")
    public Object searchOmsOrderReturnApply(@RequestBody SearchOmsOrderReturnApply searchApply) {
        System.out.println(searchApply);
        List<OmsOrderReturnApply> omsOrderReturnApplies = adminOmsOrderService.searchOmsOrderReturnApply(searchApply);
        return omsOrderReturnApplies;
    }

    /**
     * 根据退货id（服务单号）查询订单详情
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("showOmsOrderReturnApplyById")
    public Object showOmsOrderReturnApplyById(@RequestParam int id) {
        OmsOrderReturnApply omsOrderReturnApply = adminOmsOrderService.showOmsOrderReturnApplyById(id);
        return omsOrderReturnApply;
    }

    /**
     * 查询所有的退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllReturnReason")
    public Object listAllReturnReason() {
        List<OmsOrderReturnReason> omsOrderReturnReasons = adminOmsOrderService.listAllReturnReason();
        return omsOrderReturnReasons;
    }

    /**
     * 添加一个退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("insertReturnReason")
    public Object insertReturnReason(@RequestBody UpdateReturnReason updateReturnReason) {
        int i = adminOmsOrderService.insertReturnReason(updateReturnReason);
        return i;
    }

    /**
     * 修改一个退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("updateReturnReason")
    public Object updateReturnReason(@RequestBody UpdateReturnReason updateReturnReason) {
        int i = adminOmsOrderService.updateReturnReason(updateReturnReason);
        return i;
    }

    /**
     * 删除一个退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteReturnReason")
    public Object deleteReturnReason(@RequestParam int id) {
        int i = adminOmsOrderService.deleteReturnReason(id);
        return i;
    }



}

