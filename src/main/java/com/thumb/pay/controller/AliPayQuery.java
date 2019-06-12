package com.thumb.pay.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.thumb.pay.utils.AlipayConfig;

public class AliPayQuery {
    /**
     *
     * @param out_trade_no  商户订单号，商户网站订单系统中唯一订单号
     * @return
     */
    public static String sendAliPay(String out_trade_no) {

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","UTF-8",AlipayConfig.alipay_public_key,AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();



        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        System.out.println(result);

        //为确保安全通信，需自行验证响应示例中的sign值是否为蚂蚁金服所提供。
        return result;
    }
}
