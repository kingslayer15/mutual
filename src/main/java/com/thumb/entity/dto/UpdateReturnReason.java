package com.thumb.entity.dto;

import lombok.Data;

/**
 * @author Liming
 * @date 2019/6/5 21:15
 */

@Data
public class UpdateReturnReason {
    private int id;
    private String name;
    private int sort;
    private int status;
    private String create_time;

//        "id":12,
//        "name":"",
//        "sort":1,
//        "status":1,
//        "create_time":"2019-06-05"
}
