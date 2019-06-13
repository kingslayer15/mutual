package com.thumb.mapper;

import com.thumb.dto.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonalOrderMapper {
    List<ClientOrderDto> orderByUid(int uid);

    int changeStatus(int product_id);

    Client_order_itemDto getRefundProduct(int product_id);

    List<RefundReasonsDto> getreasons();

    ClientRefundDto getReturnInfo(int itemId);

    int addReturnAapply(ClientRefundDto returnInfo);

    int addRate(RateDto rateDto);
}
