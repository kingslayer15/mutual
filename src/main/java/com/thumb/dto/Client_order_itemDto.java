package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@ToString

public class Client_order_itemDto {
    BigInteger id;
    BigInteger product_id;
    String product_pic;
    String product_name;
    String product_attr;
    BigDecimal real_amount;
    int product_quantity;

}
