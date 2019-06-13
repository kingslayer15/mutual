package com.thumb.service;

import com.thumb.dto.*;

import java.util.List;

public interface PersonalOrderService {
    List<ClientOrderDto> orderByUid(int uid);

    int changeStatus(int product_id);

    Client_order_itemDto getRefundProduct(int product_id);

    boolean addRefundAppply(ClientRefundDto clientRefundDto);

    List<RefundReasonsDto> getreasons();

    int addRate(RateDto rateDto);
}
