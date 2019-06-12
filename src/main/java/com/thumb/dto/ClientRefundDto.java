package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@ToString
public class ClientRefundDto {
/**
 * id bigint(20) NOT NULL
 * order_id bigint(20) NULL订单id
 * company_address_id bigint(20) NULL收货地址表id
 * product_id bigint(20) NULL退货商品id
 * order_sn varchar(64) NULL订单编号
 * create_time datetime NULL申请时间
 * member_username varchar(64) NULL会员用户名
 * return_amount decimal(10,2) NULL退款金额
 * return_name varchar(100) NULL退货人姓名
 * return_phone varchar(100) NULL退货人电话
 * status int(1) NULL申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
 * handle_time datetime NULL处理时间
 * product_pic varchar(500) NULL商品图片
 * product_name varchar(200) NULL商品名称
 * product_brand varchar(200) NULL商品品牌
 * product_attr varchar(500) NULL商品销售属性：颜色：红色；尺码：xl;
 * product_count int(11) NULL退货数量
 * product_price decimal(10,2) NULL商品单价
 * product_real_price decimal(10,2) NULL商品实际支付单价
 * reason varchar(200) NULL原因
 * description varchar(500) NULL描述
 * proof_pics varchar(1000) NULL凭证图片，以逗号隔开
 *
 * handle_note varchar(500) NULL处理备注
 * handle_man varchar(100) NULL处理人员
 * receive_man varchar(100) NULL收货人
 * receive_time datetime NULL收货时间
 * receive_note varchar(500) NULL收货备注
 */



    int id;
    BigInteger order_id;//订单id
    BigInteger product_id;
    String order_sn;
    String create_time;
    String member_username;
    BigDecimal return_amount;
    String return_name;
    String return_phone;
    int status;
    String product_pic;
    String product_name;
    String product_brand;
    String product_attr;
    int product_count;
    BigDecimal product_price;
    BigDecimal product_real_price;
    String reason;
    String description;
    String proof_pics;







}
