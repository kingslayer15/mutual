package com.thumb.controller;

import com.thumb.mapper.OmsOrderMapper;
import com.thumb.pay.controller.AliPayAction;
import com.thumb.pay.controller.AliPayRefund;
import com.thumb.pay.utils.OrderNoUtils;
import com.thumb.pay.vo.AliPayInfoVo;
import com.thumb.pojo.OmsCartItem;
import com.thumb.pojo.OmsOrder;
import com.thumb.pojo.UmsMember;
import com.thumb.pojo.UmsMemberReceiveAddress;
import com.thumb.service.OmsOrderService;
import com.thumb.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.OrderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
public class OrderDetailsController {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @Autowired
    OmsOrderService omsOrderService;

    @ResponseBody
    @RequestMapping(value = "getItem",method = RequestMethod.GET)
    public Object getItem(HttpSession httpSession){

        List<OmsCartItem> omsCartItems = (List<OmsCartItem>) httpSession.getAttribute("omsCartItems");

        return omsCartItems;
    }

    @ResponseBody
    @RequestMapping(value = "getAddress",method = RequestMethod.GET)
    public Object getAddress(){

        List<UmsMemberReceiveAddress> all = umsMemberReceiveAddressService.findAll();

        return all;
    }


    @ResponseBody
    @RequestMapping("aliPayActionRequest")
    public Object aliPayActionRequest(HttpSession httpSession,AliPayInfoVo aliPayInfoVo){



        OrderNoUtils orderNoUtils = new OrderNoUtils();

//        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");




        //获取最后一个订单的创建时间
        Date lastDate = omsOrderService.findFirstCreateTimeOrderByCreateTimeDesc();

        String orderNo = orderNoUtils.creatOrderNo(lastDate);

        aliPayInfoVo.setOut_trade_no(orderNo);

        System.out.println(aliPayInfoVo);

//        OmsOrder omsOrder = new OmsOrder();
//        omsOrder.setOrderSn(orderNo);
//        omsOrder.setCreateTime(new Date());
//        omsOrder.setMemberUsername(umsMember.getUsername());
//        omsOrder.setTotalAmount(new BigDecimal(total_amount));
//        omsOrder.setPayAmount(new BigDecimal(total_amount));
//        omsOrder.setFreightAmount(new BigDecimal(0));
//        omsOrder.setPayType(1);
//        omsOrder.setSourceType(1);
//        omsOrder.setStatus(0);




        String result = AliPayAction.sendAliPay(orderNo, aliPayInfoVo.getTotal_amount(), aliPayInfoVo.getSubject(), aliPayInfoVo.getBody());



        return result;
    }



//    @RequestMapping(value = "tt",method = RequestMethod.POST)
//    public Object tt(@RequestBody AliPayInfoVo aliPayInfoVo){
//
//
//        return "/ttt";
//    }



    @ResponseBody
    @RequestMapping("aliPayRefundRequest")
    public Object aliPayRefundRequest(HttpSession httpSession,AliPayInfoVo aliPayInfoVo) {

        String result = AliPayRefund.sendAliPay("", "", "");

        return result;
    }

    }
