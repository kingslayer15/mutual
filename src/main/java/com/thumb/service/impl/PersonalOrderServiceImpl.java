package com.thumb.service.impl;

import com.thumb.dto.ClientOrderDto;
import com.thumb.mapper.PersonalOrderMapper;
import com.thumb.service.PersonalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalOrderServiceImpl implements PersonalOrderService {
    @Autowired
    PersonalOrderMapper personalOrderMapper;


    @Override
    public List<ClientOrderDto> orderByUid(int uid) {
        return personalOrderMapper.orderByUid(uid);
    }

    @Override
    public int changeStatus(int product_id) {
        return personalOrderMapper.changeStatus(product_id);
    }
}
