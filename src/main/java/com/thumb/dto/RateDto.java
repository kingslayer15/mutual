package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class RateDto {
    BigInteger product_id;
    String member_nick_name;
    String product_name;
    int star;
    String create_time;
    String product_attribute;
    String content;
    String pics;



}
