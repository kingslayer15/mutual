package com.thumb.entity.pojo;

import lombok.Data;

import java.util.List;


//订单的表面信息
@Data
public class OmsOrder {

    private int id;             //订单id
    private int member_id;      //用户id
    private String order_sn;    //订单编号
    private String create_time; //提交时间
    private String member_username;  //用户账号名
    private float total_amount;     //订单的实际金额
    private float pay_amount;       //订单的应付金额
    private int pay_type;           //支付方式类型
    private int source_type;        //订单来源
    private int status;             //订单的状态

    List<OmsOrderItem> omsOrderItemList;    //该订单下的所有商品的集合

}
