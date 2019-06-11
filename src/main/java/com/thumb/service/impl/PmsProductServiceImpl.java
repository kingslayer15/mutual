package com.thumb.service.impl;

import com.thumb.pojo.PmsSkuStock;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.mapper.PmsProductMapper;
import com.thumb.pojo.PmsProduct;
import com.thumb.service.PmsProductService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PmsProductServiceImpl implements PmsProductService {

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

    @Override
    public BigDecimal countByLowStock() {
        BigDecimal bigDecimal = pmsProductMapper.countByLowStock();

        return bigDecimal;
    }

    @Override
    public BigDecimal countByEndTime() {

        BigDecimal bigDecimal = pmsProductMapper.countByEndTime();

        return bigDecimal;
    }

    @Override
    public BigDecimal countByPublishStatus(Integer status) {
        BigDecimal bigDecimal = pmsProductMapper.countByPublishStatus(status);
        return bigDecimal;
    }


    @Override
    public BigDecimal countAll() {
        BigDecimal bigDecimal = pmsProductMapper.countAll();
        return bigDecimal;
    }

    @Override
    public List<PmsProduct> selectOneById(Long id) {
        System.out.println("service"+id);
        return pmsProductMapper.selectOneById(id);
    }

    @Override
    public List<PmsProduct> getColorById(Long id) {
        return pmsProductMapper.getColorById(id);
    }

}

