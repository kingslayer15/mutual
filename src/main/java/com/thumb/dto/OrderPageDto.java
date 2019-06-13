package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderPageDto {

    int uid;
    int begin;
    int total;
    int infoPerPage;
}
