package com.thumb.service;

import com.thumb.pojo.PmsProductCategory;
public interface PmsProductCategoryService{


    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    int insertSelective(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategory record);

    int updateByPrimaryKey(PmsProductCategory record);

}
