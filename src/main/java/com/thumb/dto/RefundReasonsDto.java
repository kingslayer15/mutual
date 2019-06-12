package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class RefundReasonsDto {

    BigInteger id;
    String name;
    int status;
}
