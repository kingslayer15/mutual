package com.thumb.mapper;

import com.thumb.pojo.PmsProduct;import java.math.BigDecimal;import java.util.List;

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

    List<PmsProduct> selectOneById(Long id);

    List<PmsProduct> getColorById(Long id);
}