package com.thumb.service.impl;

import com.thumb.dto.ClientAddressDto;
import com.thumb.mapper.PersonalAddressMapper;
import com.thumb.service.PersonalAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalAddressServiceImpl implements PersonalAddressService {
    @Autowired
    PersonalAddressMapper personalAddressMapper;

    @Override
    public int newAddress(ClientAddressDto clientAddressDto) {
        return personalAddressMapper.newAddress(clientAddressDto);
    }

    @Override
    public ClientAddressDto getAaddressById(int uId) {
        return personalAddressMapper.getAaddressById(uId);
    }
}
