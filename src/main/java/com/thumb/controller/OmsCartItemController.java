package com.thumb.controller;


import com.thumb.pojo.OmsCartItem;
import com.thumb.service.OmsCartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OmsCartItemController {

    @Autowired
    OmsCartItemService omsCartItemService;


    @RequestMapping(value = "findByMemberId",method = RequestMethod.GET)
    @ResponseBody
    public Object findByMemberId(@RequestParam Long id){



        List<OmsCartItem> cartItem = omsCartItemService.findByMemberId(id);
        return cartItem;
    }

    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
    public Object deleteByPrimaryKey(@RequestParam Long id){

        int i = omsCartItemService.deleteByPrimaryKey(id);


        return "redirect:/main/gouwuche.html";
    }


    @ResponseBody
    @RequestMapping(value = "saveItem",method = RequestMethod.POST)
    public Object saveItem(@RequestBody List<OmsCartItem> items, HttpSession httpSession){

        httpSession.setAttribute("omsCartItems",items);

        return items;
    }

}
