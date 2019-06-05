package com.thumb.entity.dto;

import lombok.Data;

@Data
public class SearchOmsOrder {
    //订单编号模糊查询条件
    private String order_sn;
    //客户的(客户表)账号或者(订单表接收者)手机 模糊查询
    private String member;
    //必须要正确的日期格式（yy-MM-dd)，精确查询
    private String create_time;

    private int status, order_type, source_type;
}
