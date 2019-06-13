package com.thumb.service.impl;

import com.thumb.entity.dto.MerchantDto;
import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.Merchant;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import com.thumb.mapper.MerchantOmsOrderMapper;
import com.thumb.service.MerchantOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liming
 * @date 2019/6/11 22:19
 */
@Service
public class MerchantOmsOrderServiceImpl implements MerchantOmsOrderService {

    @Autowired
    MerchantOmsOrderMapper merchantOmsOrderMapper;

    @Override
    public Merchant listAllOmsOrderByMerchant(int merchantId) {
        return merchantOmsOrderMapper.listAllOmsOrderByMerchant(merchantId);
    }

    @Override
    public Merchant merchantSearchOmsOrder(SearchOmsOrder searchOmsOrder) {
        return merchantOmsOrderMapper.merchantSearchOmsOrder(searchOmsOrder);
    }

    @Override
    public Merchant merchantOmsOrderItemByOrderId(MerchantDto merchantDto) {
        return merchantOmsOrderMapper.merchantOmsOrderItemByOrderId(merchantDto);
    }

    @Override
    public List<OmsOrderReturnApply> merchantOmsOrderReturnApply(int id) {
        return merchantOmsOrderMapper.merchantOmsOrderReturnApply(id);
    }

    @Override
    public OmsOrderReturnApply merchantOmsOrderReturnApplyById(MerchantDto merchantDto) {
        return merchantOmsOrderMapper.merchantOmsOrderReturnApplyById(merchantDto);
    }
}
