package com.thumb.controller;

import com.thumb.dto.ClientOrderDto;
import com.thumb.service.PersonalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PersonalOrderController {
    @Autowired
    PersonalOrderService personalOrderService;


    @ResponseBody
    @RequestMapping("orderByUid")
    public Object orderByUid(HttpServletRequest httpServletRequest){
        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid(uId);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }

    @ResponseBody
    @RequestMapping("changeStatus")
    public boolean changeStatus(@RequestParam("id") int product_id){
        int i=personalOrderService.changeStatus(product_id);
        if (i!=0){
            return true;
        }
        return false;
    }
}
