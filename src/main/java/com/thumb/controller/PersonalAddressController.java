package com.thumb.controller;

import com.thumb.dto.ClientAddressDto;
import com.thumb.service.PersonalAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PersonalAddressController {

    @Autowired
    PersonalAddressService personalAddressService;

    @ResponseBody
    @RequestMapping("addAddress")
    public boolean addAddress(@RequestBody ClientAddressDto clientAddressDto){

        int i=personalAddressService.newAddress(clientAddressDto);
        if (i!=0){
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("addressById")
    public Object addressById(HttpServletRequest httpServletRequest){
        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        ClientAddressDto clientAddressDto=personalAddressService.getAaddressById(uId);


        return clientAddressDto;

    }




}
