package com.thumb.service;

import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCollection;

import java.util.List;

public interface PmsProductCollectionService{


    int insert(PmsProductCollection record);

    int insertSelective(PmsProductCollection record);

    int insertCollection(OmsCartItemDto record);

    List<PmsProduct> selectAllBymemberId(long memberId);
}
