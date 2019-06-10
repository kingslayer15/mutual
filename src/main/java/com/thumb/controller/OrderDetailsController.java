package com.thumb.controller;

import com.thumb.pojo.OmsCartItem;
import com.thumb.pojo.UmsMemberReceiveAddress;
import com.thumb.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderDetailsController {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @ResponseBody
    @RequestMapping(value = "getItem",method = RequestMethod.GET)
    public Object getItem(HttpSession httpSession){

        List<OmsCartItem> omsCartItems = (List<OmsCartItem>) httpSession.getAttribute("omsCartItems");

        return omsCartItems;
    }

    @ResponseBody
    @RequestMapping(value = "getAddress",method = RequestMethod.GET)
    public Object getAddress(){

        List<UmsMemberReceiveAddress> all = umsMemberReceiveAddressService.findAll();



        return all;
    }
}
