package com.thumb.service;

import com.thumb.entity.dto.MerchantDto;
import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.Merchant;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MerchantOmsOrderService {
    Merchant listAllOmsOrderByMerchant(int merchantId);

    Merchant merchantSearchOmsOrder(SearchOmsOrder searchOmsOrder);

    Merchant merchantOmsOrderItemByOrderId(MerchantDto merchantDto);

    List<OmsOrderReturnApply> merchantOmsOrderReturnApply(int id);

    OmsOrderReturnApply merchantOmsOrderReturnApplyById(MerchantDto merchantDto);
}
