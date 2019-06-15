package com.thumb.controller;


import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.OmsCartItem;
import com.thumb.pojo.PmsProductCollection;
import com.thumb.pojo.UmsMember;
import com.thumb.service.OmsCartItemService;
import com.thumb.service.PmsProductCollectionService;
import com.thumb.service.PmsProductService;
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

    @Autowired
    PmsProductService pmsProductService;


    @RequestMapping(value = "findByMemberId",method = RequestMethod.GET)
    @ResponseBody
    public Object findByMemberId(@RequestParam Long id){

        List<OmsCartItem> cartItem = omsCartItemService.findByMemberId(id);
        for (OmsCartItem omsCartItem : cartItem) {
            omsCartItem.setProductPic(pmsProductService.selectByPrimaryKey(omsCartItem.getProductId()).getPic());
        }
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


    /**
     * 加入购物车,根据前台的选择信息查到购物车对象
     * 如果对象空,插入前台信息
     * 如果有对象,该对象拿id,以及拿数量,根据数量++和id去update数量
     * @param omsCartItemDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectOneByAll2",method = RequestMethod.POST)
    public Object selectOneByAll2(@RequestBody OmsCartItemDto omsCartItemDto){
        OmsCartItem omsCartItem = omsCartItemService.selectOneByAll2(omsCartItemDto);
        System.out.println(omsCartItem+"前台传入的值");
        if (omsCartItem==null) {
            int insert = omsCartItemService.insertCart(omsCartItemDto);
            System.out.println(insert+"空则插入");
            return insert;

        } else {
            Long id1 = omsCartItem.getId();
            System.out.println(id1);
            Integer quantity = omsCartItem.getQuantity();
            System.out.println(quantity);
            quantity++;
            int i = omsCartItemService.updateQuantityById(quantity,id1);
            System.out.println(i+"quantity++");
            return "++";

        }

    }


    @ResponseBody
    @RequestMapping(value = "getMemberId",method = RequestMethod.GET)
    public Object getMenberId(HttpSession httpSession){
        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");
        Long memberId = umsMember.getId();
        return memberId;


    }

    /**
     * 加入收藏夹,是否有收藏,有改0,没有改1
     * @param omsCartItemDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "insertCollection", method = RequestMethod.POST)
    public Object insertCollection(@RequestBody OmsCartItemDto omsCartItemDto) {
        System.out.println(omsCartItemDto);

        //根据产品id,会员id找收藏夹对象
        PmsProductCollection pmsProductCollection = pmsProductCollectionService.selectOneByAll(omsCartItemDto);
        System.out.println(pmsProductCollection);

        //如果有
        if (pmsProductCollection != null) {
            Integer id = pmsProductCollection.getId();
            Integer states = pmsProductCollection.getStates();
            //如果状态1
            if (states == 1) {
                //改成0
                int i = pmsProductCollectionService.updateById(id);
                return "0";
            } else {
                //改成1
                int i = pmsProductCollectionService.updateCollectionStatesFor1ById(id);
                return "1";

            }
            //状态改0

        }
        //如果没有
        else {
            int insert = pmsProductCollectionService.insertCollection(omsCartItemDto);
            if (insert != 0) {
                System.out.println(insert);
                return true;
            }
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/updateCartItem", method = RequestMethod.POST)
    public Object updateCartItem(@RequestBody OmsCartItem omsCartItem) {

        System.out.println(omsCartItem);
        int i = omsCartItemService.updateByPrimaryKeySelective(omsCartItem);

        OmsCartItem returnOmsCartItem = omsCartItemService.selectByPrimaryKey(omsCartItem.getId());


//        omsCartItemService.selectByPrimaryKey()

        return returnOmsCartItem;
    }


    @RequestMapping(value = "selectCartItemById",method = RequestMethod.GET)
    @ResponseBody
    public Object selectCartItemById(@RequestParam Long id){

        OmsCartItem omsCartItem = omsCartItemService.selectByPrimaryKey(id);

        return omsCartItem;
    }
}


