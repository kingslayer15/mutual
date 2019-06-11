package com.thumb.mapper;

import com.thumb.pojo.PmsProduct;import java.math.BigDecimal;

public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    BigDecimal countByLowStock();

    BigDecimal countByEndTime();

    BigDecimal countByPublishStatus(Integer status);

    BigDecimal countAll();

}