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

    /**
     * 通过id查询集合
     * @param id
     * @return
     */
    List<PmsSkuStock> selectByPid(Long id);

    /**
     * 通过价格名字查找对象集合回显
     * @param price
     * @param sp2
     * @return
     */
    List<PmsSkuStock> selectAllByPriceAndsp2(@Param("price")BigDecimal price,@Param("sp2")String sp2);

    /**
     * 通过对象查询集合
     * @param pmsSkuStock
     * @return
     */
    List<PmsSkuStock> selectByAll(PmsSkuStock pmsSkuStock);











}