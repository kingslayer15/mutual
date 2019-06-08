package com.thumb.mapper;

import com.thumb.dto.ClientAddressDto;

import java.util.List;

public interface PersonalAddressMapper {
    int newAddress(ClientAddressDto clientAddressDto);

    List<ClientAddressDto> getAaddressById(int uId);

    ClientAddressDto findOneAddress(ClientAddressDto clientAddressDto);

    int updateOneAddress(ClientAddressDto clientAddressDto);

    int deleteOneAddress(int id);

    int allZero(int uid);

    int setDefault(int id);
}
