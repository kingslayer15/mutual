package com.thumb.entity.pojo;

import lombok.Data;

//订单中每个商品品信息
@Data
public class OmsOrderItem {

    private int id;
    private int order_id;       //订单id，也是OmsOrder类中的id
//    private String order_sn;    //订单编号
    private int product_id;    //产品id
    private String product_pic;     //产品的图片
    private String product_name;    //产品的名称
    private String product_brand;   //产品的品牌
    private String product_sn;      //产品的编号
    private float product_price;    //产品的价格
    private int product_quantity;   //购买该产品的数量


}
