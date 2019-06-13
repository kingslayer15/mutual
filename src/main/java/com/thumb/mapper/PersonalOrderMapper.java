package com.thumb.mapper;

import com.thumb.dto.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonalOrderMapper {
    List<ClientOrderDto> orderByUid(OrderPageDto orderPageDto);

    int changeStatus(int product_id);

    Client_order_itemDto getRefundProduct(int product_id);

    List<RefundReasonsDto> getreasons();

    ClientRefundDto getReturnInfo(int itemId);

    int addReturnAapply(ClientRefundDto returnInfo);

    int addRate(RateDto rateDto);

    List<ClientOrderDto> orderByUid0(OrderPageDto orderPageDto);
    List<ClientOrderDto> orderByUid1(OrderPageDto orderPageDto);
    List<ClientOrderDto> orderByUid2(OrderPageDto orderPageDto);
    List<ClientOrderDto> orderByUid3(OrderPageDto orderPageDto);

    int count(int uid);

    int count0(int uid);

    int count1(int uid);

    int count2(int uid);

    int count3(int uid);



}
