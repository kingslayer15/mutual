package com.thumb.controller;

import com.thumb.mapper.OmsOrderMapper;
import com.thumb.pay.controller.AliPayAction;
import com.thumb.pay.controller.AliPayQuery;
import com.thumb.pay.controller.AliPayRefund;
import com.thumb.pay.utils.OrderNoUtils;
import com.thumb.pay.vo.AliPayInfoVo;
import com.thumb.pojo.OmsCartItem;
import com.thumb.pojo.OmsOrder;
import com.thumb.pojo.UmsMember;
import com.thumb.pojo.UmsMemberReceiveAddress;
import com.thumb.service.OmsOrderService;
import com.thumb.service.UmsMemberReceiveAddressService;
import com.thumb.service.UmsMemberService;
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

    @Autowired
    UmsMemberService umsMemberService;

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

        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");




        //获取最后一个订单的创建时间
        Date lastDate = omsOrderService.findFirstCreateTimeOrderByCreateTimeDesc();

        String orderNo = orderNoUtils.creatOrderNo(lastDate);

        aliPayInfoVo.setOrder_sn(orderNo);


        aliPayInfoVo.setMemberId(umsMember.getId());
        aliPayInfoVo.setOrder_sn(orderNo);
        aliPayInfoVo.setCreateTime(new Date());
        aliPayInfoVo.setMemberUsername(umsMember.getUsername());
        aliPayInfoVo.setTotalAmount(new BigDecimal(aliPayInfoVo.getPay_amount()));
        aliPayInfoVo.setFreightAmount(new BigDecimal(0));
        aliPayInfoVo.setPayType(1);
        aliPayInfoVo.setSourceType(1);
        aliPayInfoVo.setStatus(0);
        aliPayInfoVo.setDeleteStatus(0);

        int i = omsOrderService.insertVo(aliPayInfoVo);

        System.out.println(aliPayInfoVo);





        String result = AliPayAction.sendAliPay(orderNo, aliPayInfoVo.getPay_amount(), aliPayInfoVo.getSubject(), aliPayInfoVo.getBody());



        return result;
    }



//    @RequestMapping(value = "tt",method = RequestMethod.POST)
//    public Object tt(@RequestBody AliPayInfoVo aliPayInfoVo){
//
//
//        return "/ttt";
//    }



    @ResponseBody
    @RequestMapping("/aliPayRefundRequest")
    public Object aliPayRefundRequest() {

        String result = AliPayRefund.sendAliPay("9999", "9546", "第一次退款");

        return result;
    }


    @ResponseBody
    @RequestMapping("/aliPayQueryRequest")
    public Object aliPayQueryRequest() {

        String result = AliPayQuery.sendAliPay("9999");

        return result;
    }

}
