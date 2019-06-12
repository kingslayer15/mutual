package com.thumb.service;

import com.thumb.dto.ClientOrderDto;
import com.thumb.dto.ClientRefundDto;
import com.thumb.dto.Client_order_itemDto;
import com.thumb.dto.RefundReasonsDto;

import java.util.List;

public interface PersonalOrderService {
    List<ClientOrderDto> orderByUid(int uid);

    int changeStatus(int product_id);

    Client_order_itemDto getRefundProduct(int product_id);

    boolean addRefundAppply(ClientRefundDto clientRefundDto);

    List<RefundReasonsDto> getreasons();

}
