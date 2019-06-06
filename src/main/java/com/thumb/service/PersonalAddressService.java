package com.thumb.service;


import com.thumb.dto.ClientAddressDto;

public interface PersonalAddressService {

    int newAddress(ClientAddressDto clientAddressDto);

    ClientAddressDto getAaddressById(int uId);
}
