package com.thumb.entity.dto;

import lombok.Data;

/**
 * @author Liming
 * @date 2019/6/5 19:49
 */

@Data
public class SearchOmsOrderReturnApply {
    //服务单号
    private int id;
    //处理状态（状态-1为全选）
    private int status;
    //申请时间
    private String create_time;
    //操作人员
    private String handle_man;
    //处理时间
    private String handle_time;

//    "id" : 0,
//    "status" : -1,
//    "create_time" : "",
//    "handle_man" : "",
//    "handle_time" : ""
}
