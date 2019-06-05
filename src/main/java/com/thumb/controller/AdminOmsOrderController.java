package com.thumb.controller;

import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderItem;
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

}
