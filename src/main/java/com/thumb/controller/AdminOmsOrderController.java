package com.thumb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.entity.dto.*;
import com.thumb.entity.pojo.*;
import com.thumb.service.AdminOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;


@Controller
public class AdminOmsOrderController {

    @Autowired
    AdminOmsOrderService adminOmsOrderService;

    /**
     * 管理员分页查询数据库中的订单信息
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllOmsOrderByAdmin")
    public Object listAllOmsOrderByAdmin(@RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<OmsOrder> omsOrders = adminOmsOrderService.listAllOmsOrderByAdmin();
        PageInfo<OmsOrder> pageInfo = new PageInfo<>(omsOrders);
//        for (OmsOrder omsOrder : omsOrders) System.out.println(omsOrder);
        return pageInfo;
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
//        System.err.println(searchOmsOrder);
//        System.err.println(omsOrderLists);
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
//        System.out.println(omsOrder);
        return omsOrder;
    }

    /**
     * 根据订单id修改订单的状态
     * 0->
     * @param updateStatus
     * @return
     */
    @ResponseBody
    @RequestMapping("updateOmsOrderStatusByOrderId")
    public Object updateOmsOrderStatusByOrderId(@RequestBody UpdateStatus updateStatus) {
        int i = adminOmsOrderService.updateOmsOrderStatusByOrderId(updateStatus);
        return i;
    }

    /**
     * 根据订单id删除该订单的信息
     * @param omsOrderId
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteOmsOrderById")
    public Object deleteOmsOrderById(@RequestParam int omsOrderId) {
//        System.out.println(omsOrderId);
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
//        System.out.println(omsOrderSetting);
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
//        System.out.println(updateOmsOrderSetting);
        int i = adminOmsOrderService.updateOmsOrderSetting(updateOmsOrderSetting);
        return i;
    }

    /**
     * 查询所有的退货申请
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllOmsOrderReturnApply")
    public Object listAllOmsOrderReturnApply(@RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<OmsOrderReturnApply> omsOrderReturnApplies = adminOmsOrderService.listAllOmsOrderReturnApply();
        PageInfo<OmsOrderReturnApply> pageInfo = new PageInfo<>(omsOrderReturnApplies);
//        for (OmsOrderReturnApply oora : omsOrderReturnApplies) System.out.println(oora);
        return pageInfo;
    }

    /**
     * 根据查询条件查询退货申请信息
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
     * 根据服务id修改退货处理的状态
     * @param updateStatus
     * @return
     */
    @ResponseBody
    @RequestMapping("updateReturnApplyStatusById")
    public Object updateReturnApplyStatusById(@RequestBody UpdateStatus updateStatus) {
//        System.out.println(updateStatus);
        int i = adminOmsOrderService.updateReturnApplyStatusById(updateStatus);
        return i;
    }

    /**
     * 根据id删除退货订单
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteOrderReturnApplyById")
    public Object deleteOrderReturnApplyById(@RequestParam int id) {
        int i = adminOmsOrderService.deleteOrderReturnApplyById(id);
        return i;
    }


    /**
     * 查询所有的退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllReturnReason")
    public Object listAllReturnReason(@RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<OmsOrderReturnReason> omsOrderReturnReasons = adminOmsOrderService.listAllReturnReason();
        PageInfo<OmsOrderReturnReason> pageInfo = new PageInfo<>(omsOrderReturnReasons);
        return pageInfo;
    }

    /**
     * 添加一个退货原因
     * @return
     */
    @ResponseBody
    @RequestMapping("insertReturnReason")
    public Object insertReturnReason(@RequestBody UpdateReturnReason updateReturnReason) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-hh HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        String format = dateFormat.format(new Date());
//        System.out.println(format);
        updateReturnReason.setCreate_time(format);
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
        System.out.println(updateReturnReason);
        int i = adminOmsOrderService.updateReturnReason(updateReturnReason);
        return i;
    }

    /**
     * 修改退货原因的可用状态
     * @param updateStatus
     * @return
     */
    @ResponseBody
    @RequestMapping("updateReturnReasonStatus")
    public Object updateReturnReasonStatus(@RequestBody UpdateStatus updateStatus) {
        int i = adminOmsOrderService.updateReturnReasonStatus(updateStatus);
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

