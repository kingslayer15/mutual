package com.thumb.mapper;

import com.thumb.entity.pojo.OmsOrder;
import com.thumb.entity.pojo.OmsOrderItem;

import java.util.List;

/**
 * @author Liming
 * @date 2019/6/5 11:57
 */
public interface TestMapper {

    List<OmsOrderItem> testOmsOrderItem();

    OmsOrder getOmsOrderById(int id);

}
