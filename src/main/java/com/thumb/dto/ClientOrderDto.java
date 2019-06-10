package com.thumb.dto;

import java.math.BigInteger;

public class ClientOrderDto {
    BigInteger id;
    BigInteger member_id;
    String order_sn;//订单编号
    String member_username;//用户昵称
    int status;//订单状态 0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    String create_time;//订单提交时间
    String pay_amount;//付款总额
    int pay_type;//支付方式

}
