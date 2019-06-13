package com.thumb.controller;

import com.thumb.dto.ClientAddressDto;
import com.thumb.entity.pojo.UmsMember;
import com.thumb.service.PersonalAddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.List;

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

//获取某个用户所有地址
    @ResponseBody
    @RequestMapping("addressById")
    public Object addressById(HttpServletRequest httpServletRequest){
        System.out.println("查找地址"+1);
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
        int uId = umsMember.getId().intValue();
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        List<ClientAddressDto> clientAddressDto=personalAddressService.getAaddressById(uId);
        System.out.println(clientAddressDto);
        return clientAddressDto;

    }

    //获取单个地址信息
    @ResponseBody
    @RequestMapping("getOneAddress")
    public Object getOneAddress(HttpServletRequest httpServletRequest, @RequestParam("addressId") int id){
        System.out.println("查找单个地址");
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
        int uId = umsMember.getId().intValue();
        ClientAddressDto address = new ClientAddressDto();
        address.setId(BigInteger.valueOf(id));
        address.setMember_id(BigInteger.valueOf(uId));
        ClientAddressDto clientAddressDto=personalAddressService.findOneAddress(address);
        return clientAddressDto;
    }

    //修改某个地址信息
    @ResponseBody
    @RequestMapping("updateOneAddress")
    public boolean updateOneAddress(@RequestBody ClientAddressDto clientAddressDto){
        int i=personalAddressService.updateOneAddress(clientAddressDto);
        if (i!=0){
            return true;
        }
        return false;
    }

    //删除某个地址
    @ResponseBody
    @RequestMapping("deleteOneAddress")
    public boolean deleteOneAddress(@RequestParam("id") int id){
        System.out.println("删除");
        int i=personalAddressService.deleteOneAddress(id);
        if (i!=0){
            return true;
        }
        return false;
    }

    //设置默认地址
    @ResponseBody
    @RequestMapping("setDefault")
    public boolean setDefault(@RequestParam("id") int id,HttpServletRequest httpServletRequest){
        System.out.println("设置默认");
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
        int uId = umsMember.getId().intValue();
        System.out.println("用户id"+uId+"地址id"+id);
        int i=personalAddressService.setDefault(id,uId);
        if (i!=0){
            return true;
        }
        return false;
    }




}
