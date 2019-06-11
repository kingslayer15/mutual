package com.thumb.service;
import java.math.BigDecimal;

import com.thumb.pojo.PmsSkuStock;

import java.util.List;

public interface PmsSkuStockService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);
    List<PmsSkuStock> selectByPid(Long id);






	List<PmsSkuStock> selectAllByPriceAndsp2(BigDecimal price,String sp2);



}
