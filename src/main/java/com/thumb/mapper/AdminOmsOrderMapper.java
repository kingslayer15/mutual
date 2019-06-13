package com.thumb.mapper;

import com.thumb.entity.dto.*;
import com.thumb.entity.pojo.*;

import java.util.List;

public interface AdminOmsOrderMapper {

    List<OmsOrder> listAllOmsOrderByAdmin();

    List<OmsOrder> searchOmsOrder(SearchOmsOrder searchOmsOrder);

    OmsOrder getOmsOrderById(int omsOrderId);

    int deleteOmsOrderById(int id);

    int deleteOmsOrderItemByOrderId(int id);

    OmsOrderSetting getOmsOrderSetting();

    int updateOmsOrderSetting(UpdateOmsOrderSetting updateOmsOrderSetting);

    List<OmsOrderReturnApply> listAllOmsOrderReturnApply();

    List<OmsOrderReturnApply> searchOmsOrderReturnApply(SearchOmsOrderReturnApply searchApply);

    OmsOrderReturnApply showOmsOrderReturnApplyById(int id);

    List<OmsOrderReturnReason> listAllReturnReason();

    int insertReturnReason(UpdateReturnReason updateReturnReason);

    int updateReturnReason(UpdateReturnReason updateReturnReason);

    int deleteReturnReason(int id);

    int updateOmsOrderStatusByOrderId(UpdateStatus updateStatus);

    int updateReturnApplyStatusById(UpdateStatus updateStatus);

    int updateReturnReasonStatus(UpdateStatus updateStatus);
}
