package com.thumb.pay.controller;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.thumb.pay.utils.AlipayConfig;
import com.thumb.pay.utils.OrderNoUtils;
import com.thumb.pay.vo.AliPayInfoVo;
import com.thumb.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;



public class AliPayAction {

//    String out_trade_no;
//    String total_amount;
//    String subject;
//    String body;


        public static String sendAliPay(String out_trade_no, String total_amount, String subject, String body){

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","UTF-8",AlipayConfig.alipay_public_key,AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();

        alipayRequest.setReturnUrl(AlipayConfig.return_url);

        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        OrderNoUtils orderNoUtils = new OrderNoUtils();

        //获取最后一个订单的创建时间
//        Date lastDate = omsOrderService.findFirstCreateTimeOrderByCreateTimeDesc();
//
//        String orderNo = orderNoUtils.creatOrderNo(lastDate);

//        out_trade_no = "1231";
//        total_amount = "1231";
//        subject="1231";
//        body  ="1231";

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String result = null;
        try {
            result = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        System.out.println(result);
        return result;
    }



//    @RequestMapping("tt")
//    public String sendAliPay(@RequestBody AliPayInfoVo aliPayInfoVo, Model model){
//
//
//
//        model.addAttribute("aliPayInfoVo",aliPayInfoVo);
//
//
//        return "/ttt";
//    }

}
