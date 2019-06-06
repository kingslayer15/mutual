package com.thumb.mapper;

import com.thumb.dto.ClientAddressDto;

public interface PersonalAddressMapper {
    int newAddress(ClientAddressDto clientAddressDto);

    ClientAddressDto getAaddressById(int uId);
}
