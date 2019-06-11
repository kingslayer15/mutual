package com.thumb.dto;

import java.math.BigInteger;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString

public class ClientOrderDto {
    BigInteger order_id;
    BigInteger member_id;
    String order_sn;//订单编号
//    String member_username;//用户昵称
    int status;//订单状态 0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    String create_time;//订单提交时间
    String pay_amount;//付款总额
    int pay_type;//支付方式
    List<Client_order_item> order_items;

    public BigInteger getOrder_id() {
        return order_id;
    }

    public BigInteger getMember_id() {
        return member_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public int getStatus() {
        return status;
    }

    public String getCreate_time() {
        return create_time.substring(0,create_time.length()-2);
    }

    public String getPay_amount() {
        return pay_amount;
    }

    public int getPay_type() {
        return pay_type;
    }

    public List<Client_order_item> getOrder_items() {
        return order_items;
    }
}
