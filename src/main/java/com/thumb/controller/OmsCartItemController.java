package com.thumb.controller;


import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.OmsCartItem;
import com.thumb.pojo.PmsProductCollection;
import com.thumb.pojo.UmsMember;
import com.thumb.service.OmsCartItemService;
import com.thumb.service.PmsProductCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OmsCartItemController {

    @Autowired
    OmsCartItemService omsCartItemService;
    @Autowired
    PmsProductCollectionService pmsProductCollectionService;


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


    @ResponseBody
    @RequestMapping(value = "insertCart",method = RequestMethod.POST)
    public Object insertCart(@RequestBody OmsCartItemDto omsCartItemDto){
        System.out.println(omsCartItemDto+"------------------------------------------------------------");
        int insert = omsCartItemService.insertCart(omsCartItemDto);
        System.out.println(insert);
        return true;


    }


    @ResponseBody
    @RequestMapping(value = "getMemberId",method = RequestMethod.GET)
    public Object getMenberId(HttpSession httpSession){
        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");
        Long memberId = umsMember.getId();
        return memberId;


    }

    @ResponseBody
    @RequestMapping(value = "insertCollection", method = RequestMethod.POST)
    public Object insertCollection(@RequestBody OmsCartItemDto omsCartItemDto) {
        System.out.println(omsCartItemDto);
        int insert = pmsProductCollectionService.insertCollection(omsCartItemDto);
        if (insert != 0) {
            System.out.println(insert);
            return true;
        }
        return false;

    }

}
