package com.thumb.entity.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Merchant {

    int id;
    String name;

    List<OmsOrder> omsOrderList;

}
