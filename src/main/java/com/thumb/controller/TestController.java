package com.thumb.controller;

import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderItem;
import com.thumb.mapper.AdminOmsOrderMapper;
import com.thumb.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Liming
 * @date 2019/6/5 11:55
 */
@RestController
public class TestController {

    @Autowired
    TestMapper testMapper;

//    @RequestMapping("t")
//    public String test(@RequestParam String t) {
//        t = "WEB-INF/background/" + t;
//        System.out.println("跳转网页：" + t);
//        return "background/order_test";
//    }

    @RequestMapping("test1")
    public Object test1() {
        List<OmsOrderItem> omsOrderItems = testMapper.testOmsOrderItem();
        System.err.println("-------------------------------------------------------------------------");
        for (OmsOrderItem omsOrder : omsOrderItems) System.err.println(omsOrder);
        System.err.println("-------------------------------------------------------------------------");
        return omsOrderItems;
    }

    @RequestMapping("test2")
    public Object test2(@RequestParam int id) {
        OmsOrder omsOrder = testMapper.getOmsOrderById(id);
        return omsOrder;
    }

}
