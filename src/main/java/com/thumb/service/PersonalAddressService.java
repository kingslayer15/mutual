package com.thumb.service;


import com.thumb.dto.ClientAddressDto;

import java.util.List;

public interface PersonalAddressService {

    int newAddress(ClientAddressDto clientAddressDto);

    List<ClientAddressDto> getAaddressById(int uId);

    ClientAddressDto findOneAddress(ClientAddressDto clientAddressDto);

    int updateOneAddress(ClientAddressDto clientAddressDto);

    int deleteOneAddress(int id);

    int setDefault(int id,int uid);
}
