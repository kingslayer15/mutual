package com.thumb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.PmsProductCategory;
import com.thumb.mapper.PmsProductCategoryMapper;
import com.thumb.service.PmsProductCategoryService;
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService{

    @Resource
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProductCategory record) {
        return pmsProductCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.insertSelective(record);
    }

    @Override
    public PmsProductCategory selectByPrimaryKey(Long id) {
        return pmsProductCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProductCategory record) {
        return pmsProductCategoryMapper.updateByPrimaryKey(record);
    }

}
