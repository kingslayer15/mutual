package com.thumb.service.impl;

import com.thumb.dto.ClientAddressDto;
import com.thumb.mapper.PersonalAddressMapper;
import com.thumb.service.PersonalAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class PersonalAddressServiceImpl implements PersonalAddressService {
    @Autowired
    PersonalAddressMapper personalAddressMapper;

    @Override
    public int newAddress(ClientAddressDto clientAddressDto) {
        return personalAddressMapper.newAddress(clientAddressDto);
    }

    @Override
    public List<ClientAddressDto> getAaddressById(int uId) {
        return personalAddressMapper.getAaddressById(uId);
    }

    @Override
    public ClientAddressDto findOneAddress(ClientAddressDto clientAddressDto) {
        return personalAddressMapper.findOneAddress(clientAddressDto);
    }

    @Override
    public int updateOneAddress(ClientAddressDto clientAddressDto) {
        return personalAddressMapper.updateOneAddress(clientAddressDto);
    }

    @Override
    public int deleteOneAddress(int id) {
        return personalAddressMapper.deleteOneAddress(id);
    }

    @Override
    public int setDefault(int id,int uid) {
        //全设置为0 再更改默认地址
        personalAddressMapper.allZero(uid);
        return personalAddressMapper.setDefault(id);
    }
}
