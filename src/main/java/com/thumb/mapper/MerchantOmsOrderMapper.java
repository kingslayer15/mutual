package com.thumb.mapper;

import com.thumb.entity.dto.MerchantDto;
import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.pojo.Merchant;
import com.thumb.entity.pojo.OmsOrderReturnApply;

import java.util.List;

/**
 * @author Liming
 * @date 2019/6/11 22:22
 */
public interface MerchantOmsOrderMapper {
    List<Merchant> listAllOmsOrderByMerchant(int merchantId);

    Merchant merchantSearchOmsOrder(SearchOmsOrder searchOmsOrder);

    Merchant merchantOmsOrderItemByOrderId(MerchantDto merchantDto);

    List<OmsOrderReturnApply> merchantOmsOrderReturnApply(int id);

    OmsOrderReturnApply merchantOmsOrderReturnApplyById(MerchantDto merchantDto);
}
