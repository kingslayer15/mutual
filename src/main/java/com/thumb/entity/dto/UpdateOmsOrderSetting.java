package com.thumb.entity.dto;

import lombok.Data;

/**
 * @author Liming
 * @date 2019/6/5 17:51
 */

@Data
public class UpdateOmsOrderSetting {
    //秒杀订单超时未付款自动关闭（min）
    private int flash_order_overtime;
    //正常订单超时未付款自动关闭（min）
    private int normal_order_overtime;
    //发货超时未收货自动完成（day）
    private int confirm_overtime;
    //订单完成超时自动结束交易，不能申请售后（day）
    private int finish_overtime;
    //订单完成超时自动五星好评（day）
    private int comment_overtime;

//    "flash_order_overtime" : 60,
//    "normal_order_overtime" : 120,
//    "confirm_overtime" : 15,
//    "finish_overtime" : 7,
//    "comment_overtime" : 7
}
