package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class ClientAddressDto {

    /**
     * id bigint(20) NOT NULL
     * member_id bigint(20) NULL
     * name varchar(100) NULL收货人名称
     * phone_number varchar(64) NULL
     * default_status int(1) NULL是否为默认
     * post_code varchar(100) NULL邮政编码
     * province varchar(100) NULL省份/直辖市
     * city varchar(100) NULL城市
     * region varchar(100) NULL区
     * detail_address varchar(128) NULL详细地址(街道)
     */

    BigInteger id;
    BigInteger member_id;
    String name;
    String phone_number;
    int default_status;
    String post_code;
    String province;
    String city;
    String region;
    String detail_address;


}
