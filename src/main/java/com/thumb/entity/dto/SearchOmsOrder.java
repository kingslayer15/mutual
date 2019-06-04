package com.thumb.entity.dto;

import lombok.Data;

@Data
public class SearchOmsOrder {
    private String order_sn, member, create_time;
    private int status, order_type, source_type;
}
