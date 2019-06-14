package com.thumb.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.entity.dto.MerchantDto;
import com.thumb.entity.dto.Page;
import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.Merchant;
import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import com.thumb.service.MerchantOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MerchantOmsOrderController {

    @Autowired
    MerchantOmsOrderService merchantOmsOrderService;

    /**
     * 根据商家id,分页查询该商家的订单
     * @param page  分页
     * @return
     */
    @RequestMapping("listAllOmsOrderByMerchant")
    public Object listAllOmsOrderByMerchant(@RequestBody Page page, HttpSession session) {

//        com.thumb.pojo.Merchant merchantSession = (com.thumb.pojo.Merchant)(session.getAttribute("merchant"));
//        int id = merchantSession.getId();

//        Object object = session.getAttribute("merchant");
//        System.out.println(object + "object");
//        int id = ((com.thumb.pojo.Merchant)(object)).getId();
//        System.out.println(id + " id");

        int id = ((com.thumb.pojo.Merchant)session.getAttribute("merchant")).getId();

        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Merchant merchant = merchantOmsOrderService.listAllOmsOrderByMerchant(id);
        PageInfo<OmsOrder> pageInfo = new PageInfo<>(merchant.getOmsOrderList());
        return pageInfo;
    }

    /**
     * 商家通过条件查询商家的订单
     * @param searchOmsOrder
     * @return
     */
    @RequestMapping("merchantSearchOmsOrder")
    public Object merchantSearchOmsOrder(@RequestBody SearchOmsOrder searchOmsOrder) {
        Merchant merchant = merchantOmsOrderService.merchantSearchOmsOrder(searchOmsOrder);
        return merchant;
    }

    /**
     * 商家根据id查询详细的订单信息
     * @param merchantDto
     * @return
     */
    @RequestMapping("merchantOmsOrderItemByOrderId")
    public Object merchantOmsOrderItemByOrderId(@RequestBody MerchantDto merchantDto) {
        Merchant merchant = merchantOmsOrderService.merchantOmsOrderItemByOrderId(merchantDto);
        return merchant;
    }


    /**
     * 商家查询所有的退货信息
     * @return
     */
    @RequestMapping("merchantOmsOrderReturnApply")
    public Object merchantOmsOrderReturnApply(@RequestBody Page page, HttpSession session) {

//        Merchant merchant = (Merchant)session.getAttribute("merchant");
//        int id = merchant.getId();

        int id = ((com.thumb.pojo.Merchant)session.getAttribute("merchant")).getId();

        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<OmsOrderReturnApply> omsOrderReturnApplies = merchantOmsOrderService.merchantOmsOrderReturnApply(id);
        PageInfo<OmsOrderReturnApply> pageInfo = new PageInfo<>(omsOrderReturnApplies);
        return pageInfo;
    }

    /**
     * 商家根据id查询详细的退货信息
     * @param merchantDto
     * @return
     */
    @RequestMapping("merchantOmsOrderReturnApplyById")
    public Object merchantOmsOrderReturnApplyById(@RequestBody MerchantDto merchantDto) {
        OmsOrderReturnApply omsOrderReturnApply = merchantOmsOrderService.merchantOmsOrderReturnApplyById(merchantDto);
        return omsOrderReturnApply;
    }


}
