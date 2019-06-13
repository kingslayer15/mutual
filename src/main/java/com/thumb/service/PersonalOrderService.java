package com.thumb.service;

import com.thumb.dto.*;

import java.util.List;

public interface PersonalOrderService {
    List<ClientOrderDto> orderByUid(OrderPageDto orderPageDto);

    int changeStatus(int product_id);

    Client_order_itemDto getRefundProduct(int product_id);

    boolean addRefundAppply(ClientRefundDto clientRefundDto);

    List<RefundReasonsDto> getreasons();

    int addRate(RateDto rateDto);

    List<ClientOrderDto> orderByUid0(OrderPageDto orderPageDto);

    List<ClientOrderDto> orderByUid1(OrderPageDto orderPageDto);
    List<ClientOrderDto> orderByUid2(OrderPageDto orderPageDto);
    List<ClientOrderDto> orderByUid3(OrderPageDto orderPageDto);

    int count(int uId);
    int count0(int uId);
    int count1(int uId);
    int count2(int uId);
    int count3(int uId);
}
