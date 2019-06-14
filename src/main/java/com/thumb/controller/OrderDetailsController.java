package com.thumb.controller;

import com.thumb.dto.ClientOrderDto;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.pay.controller.AliPayAction;
import com.thumb.pay.controller.AliPayQuery;
import com.thumb.pay.controller.AliPayRefund;
import com.thumb.pay.utils.OrderNoUtils;
import com.thumb.pay.vo.AliPayInfoVo;
import com.thumb.pojo.*;
import com.thumb.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.OrderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.BigInteger;
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

    @Autowired
    OmsOrderItemService omsOrderItemService;

    @Autowired
    PmsProductService pmsProductService;

    @Autowired
    PmsSkuStockService pmsSkuStockService;

    @ResponseBody
    @RequestMapping(value = "getItem",method = RequestMethod.GET)
    public Object getItem(HttpSession httpSession){

        List<OmsCartItem> omsCartItems = (List<OmsCartItem>) httpSession.getAttribute("omsCartItems");

        return omsCartItems;
    }

    @ResponseBody
    @RequestMapping(value = "getAddress",method = RequestMethod.GET)
    public Object getAddress(HttpSession httpSession){

        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");
        Long memberId = umsMember.getId();

        List<UmsMemberReceiveAddress> all = umsMemberReceiveAddressService.findByMemberId(memberId);

        return all;
    }


    @ResponseBody
    @RequestMapping("aliPayActionRequest")
    public Object aliPayActionRequest(HttpSession httpSession,AliPayInfoVo aliPayInfoVo){



        OrderNoUtils orderNoUtils = new OrderNoUtils();


        //获取最后一个订单的创建时间
        Date lastDate = omsOrderService.findFirstCreateTimeOrderByCreateTimeDesc();

        String orderNo = orderNoUtils.creatOrderNo(lastDate);

        //发送请求调用接口
        String result = AliPayAction.sendAliPay(orderNo, aliPayInfoVo.getPay_amount(), aliPayInfoVo.getSubject(), aliPayInfoVo.getBody());

        //生成订单
        aliPayInfoVo.setOrder_sn(orderNo);

        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");


        aliPayInfoVo.setMemberId(umsMember.getId());
        aliPayInfoVo.setOrder_sn(orderNo);
        aliPayInfoVo.setCreateTime(new Date());
        aliPayInfoVo.setMemberUsername(umsMember.getUsername());
        aliPayInfoVo.setTotalAmount(new BigDecimal(aliPayInfoVo.getPay_amount()));
        aliPayInfoVo.setFreightAmount(new BigDecimal(0));
        aliPayInfoVo.setPayType(0);
        aliPayInfoVo.setSourceType(1);
        aliPayInfoVo.setStatus(0);
        aliPayInfoVo.setDeleteStatus(0);

        int i = omsOrderService.insertVo(aliPayInfoVo);

        List<OmsCartItem> omsCartItems = (List<OmsCartItem>)httpSession.getAttribute("omsCartItems");

        Long id = omsOrderService.selectOneIdByOrderSn(orderNo);



        for (OmsCartItem omsCartItem : omsCartItems) {
            OmsOrderItem omsOrderItem = new OmsOrderItem();

            //订单id
            omsOrderItem.setOrderId(id);

            //订单编号
            omsOrderItem.setOrderSn(orderNo);

            //商品id
            omsOrderItem.setProductId(omsCartItem.getProductId());

            //商品名称
            omsOrderItem.setProductName(omsCartItem.getProductName());

            omsOrderItem.setProductBrand(omsCartItem.getProductBrand());

            omsOrderItem.setProductSn(omsCartItem.getProductSn());

            omsOrderItem.setProductSkuId(omsCartItem.getProductSkuId());

            omsOrderItem.setProductSkuCode(omsCartItem.getProductSkuCode());

            omsOrderItem.setProductCategoryId(omsCartItem.getProductCategoryId());


            //价格
            omsOrderItem.setRealAmount(omsCartItem.getPrice());

            //价格
            omsOrderItem.setProductPrice(omsCartItem.getPrice());

            //数量
            omsOrderItem.setProductQuantity(omsCartItem.getQuantity());

            //根据 omsCartItem里的productId查询出product对象，再把product对象的pic属性set进omsOrderItem
            omsOrderItem.setProductPic(pmsProductService.selectByPrimaryKey(omsCartItem.getProductId()).getPic());

            //商品颜色
            String sp1 = pmsSkuStockService.selectByPrimaryKey(omsCartItem.getProductSkuId()).getSp1();
            //商品容量
            String sp2 = pmsSkuStockService.selectByPrimaryKey(omsCartItem.getProductSkuId()).getSp2();

            //商品属性
            omsOrderItem.setProductAttr("颜色:"+sp1+",容量:" + sp2);

            omsOrderItemService.insert(omsOrderItem);


        }

        return result;
    }







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
