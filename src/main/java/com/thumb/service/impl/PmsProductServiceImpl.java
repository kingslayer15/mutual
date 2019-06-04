package com.thumb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.mapper.PmsProductMapper;
import com.thumb.pojo.PmsProduct;
import com.thumb.service.PmsProductService;
@Service
public class PmsProductServiceImpl implements PmsProductService{

    @Resource
    private PmsProductMapper pmsProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsProduct record) {
        return pmsProductMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProduct record) {
        return pmsProductMapper.insertSelective(record);
    }

    @Override
    public PmsProduct selectByPrimaryKey(Long id) {
        return pmsProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProduct record) {
        return pmsProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsProduct record) {
        return pmsProductMapper.updateByPrimaryKey(record);
    }

}
