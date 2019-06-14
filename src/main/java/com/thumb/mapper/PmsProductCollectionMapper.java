package com.thumb.mapper;
import org.apache.ibatis.annotations.Param;

import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCollection;

import java.util.List;

public interface PmsProductCollectionMapper {
    int insert(PmsProductCollection record);


    int insertSelective(PmsProductCollection record);


    int insertCollection(OmsCartItemDto record);

    List<PmsProduct> selectAllBymemberId(long memberId);

    PmsProductCollection selectOneByAll(OmsCartItemDto omsCartItemDto);

    int updateById(Integer id);

    int updateCollectionStatesFor1ById(Integer id);






}