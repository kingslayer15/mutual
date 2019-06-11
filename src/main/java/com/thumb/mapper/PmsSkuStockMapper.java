package com.thumb.mapper;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.PmsSkuStock;

import java.util.List;

public interface PmsSkuStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);

    List<PmsSkuStock> selectByPid(Long id);

    List<PmsSkuStock> selectAllByPriceAndsp2(@Param("price")BigDecimal price,@Param("sp2")String sp2);




}