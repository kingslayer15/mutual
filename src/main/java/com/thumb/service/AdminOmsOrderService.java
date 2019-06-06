package com.thumb.service;

import com.thumb.entity.dto.SearchOmsOrder;
import com.thumb.entity.dto.SearchOmsOrderReturnApply;
import com.thumb.entity.dto.UpdateOmsOrderSetting;
import com.thumb.entity.dto.UpdateReturnReason;
import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderReturnApply;
import com.thumb.entity.pojo.OmsOrderReturnReason;
import com.thumb.entity.pojo.OmsOrderSetting;

import java.util.List;

public interface AdminOmsOrderService {

    List<OmsOrder> listAllOmsOrderByAdmin();

    List<OmsOrder> searchOmsOrder(SearchOmsOrder searchOmsOrder);

    OmsOrder getOmsOrderById(int omsOrderId);

    int deleteOmsOrderById(int omsOrderId);

    OmsOrderSetting getOmsOrderSetting();

    int updateOmsOrderSetting(UpdateOmsOrderSetting updateOmsOrderSetting);

    List<OmsOrderReturnApply> listAllOmsOrderReturnApply();

    List<OmsOrderReturnApply> searchOmsOrderReturnApply(SearchOmsOrderReturnApply searchApply);

    OmsOrderReturnApply showOmsOrderReturnApplyById(int id);

    List<OmsOrderReturnReason> listAllReturnReason();

    int insertReturnReason(UpdateReturnReason updateReturnReason);

    int updateReturnReason(UpdateReturnReason updateReturnReason);

    int deleteReturnReason(int id);
}
