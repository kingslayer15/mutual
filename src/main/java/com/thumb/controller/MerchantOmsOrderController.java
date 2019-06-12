package com.thumb.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.entity.dto.MerchantDto;
import com.thumb.entity.dto.Page;
import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.Merchant;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import com.thumb.service.MerchantOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MerchantOmsOrderController {

    @Autowired
    MerchantOmsOrderService merchantOmsOrderService;

    /**
     * 根据商家id,分页查询该商家的订单
     * @param merchantId
     * @return
     */
    @RequestMapping("listAllOmsOrderByMerchant")
    public Object listAllOmsOrderByMerchant(@RequestBody Page page, @RequestParam int merchantId) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Merchant> merchantList = merchantOmsOrderService.listAllOmsOrderByMerchant(merchantId);
        PageInfo<Merchant> pageInfo = new PageInfo<>(merchantList);
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
     * @param id    商家id
     * @return
     */
    @RequestMapping("merchantOmsOrderReturnApply")
    public Object merchantOmsOrderReturnApply(@RequestParam int id) {
        List<OmsOrderReturnApply> omsOrderReturnApplies = merchantOmsOrderService.merchantOmsOrderReturnApply(id);
        return omsOrderReturnApplies;
    }

    /**
     * 商家根据id查询详细的退货信息
     * @param merchantDto
     * @return
     */
    @RequestMapping
    public Object merchantOmsOrderReturnApplyById(@RequestBody MerchantDto merchantDto) {
        OmsOrderReturnApply omsOrderReturnApply = merchantOmsOrderService.merchantOmsOrderReturnApplyById(merchantDto);
        return omsOrderReturnApply;
    }






}
