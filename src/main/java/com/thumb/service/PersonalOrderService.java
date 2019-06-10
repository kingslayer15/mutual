package com.thumb.service;

import com.thumb.dto.ClientOrderDto;

import java.util.List;

public interface PersonalOrderService {
    List<ClientOrderDto> orderByUid(int uid);

    int changeStatus(int product_id);
}
