package com.thumb.pay.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.thumb.pay.utils.AlipayConfig;

public class AliPayRefund {

    /**
     *
     * @param out_trade_no  商户订单号，商户网站订单系统中唯一订单号
     * @param refund_amount 需要退款的金额，该金额不能大于订单金额，必填
     * @param refund_reason 退款的原因说明
     * @return
     */
    public static String sendAliPay(String out_trade_no,String refund_amount, String refund_reason) {

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","UTF-8",AlipayConfig.alipay_public_key,AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        alipayRequest.setReturnUrl(AlipayConfig.return_url);

        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);




        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"refund_amount\":\""+ refund_amount +"\","
                + "\"refund_reason\":\""+ refund_reason +"\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }



//为确保安全通信，需自行验证响应示例中的sign值是否为蚂蚁金服所提供。
        return result;
    }
}
