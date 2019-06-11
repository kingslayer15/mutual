package com.thumb.service;

import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsSkuStock;

import java.math.BigDecimal;
import java.util.List;

public interface PmsProductService {


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
