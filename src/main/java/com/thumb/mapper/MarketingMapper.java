package com.thumb.mapper;

import com.thumb.pojo.Brand;

import java.util.List;

public interface MarketingMapper {

    /**
     * 获取正在推荐的品牌
     *
     * @return
     */
    List<Brand> selectBrandAll();

}
