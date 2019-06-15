package com.thumb.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmsCartItemDto {
    int id;

    int productId;
    int productSkuId;
    int memberId;
    int quantity;
    double price;
    String sp1;
    String sp2;
    String productName;
    String productSubTitle;
    String memberNickname;
    Date createDate;
    int deleteStatus;
    int productCategoryId;
}
