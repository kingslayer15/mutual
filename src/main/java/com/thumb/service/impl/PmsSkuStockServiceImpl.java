package com.thumb.service.impl;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.mapper.PmsSkuStockMapper;
import com.thumb.pojo.PmsSkuStock;
import com.thumb.service.PmsSkuStockService;

import java.util.List;

@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService{

    @Resource
    private PmsSkuStockMapper pmsSkuStockMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pmsSkuStockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PmsSkuStock record) {
        return pmsSkuStockMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsSkuStock record) {
        return pmsSkuStockMapper.insertSelective(record);
    }

    @Override
    public PmsSkuStock selectByPrimaryKey(Long id) {
        return pmsSkuStockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PmsSkuStock record) {
        return pmsSkuStockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PmsSkuStock record) {
        return pmsSkuStockMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<PmsSkuStock> selectByPid(Long id) {
        System.out.println("service"+id);
        return pmsSkuStockMapper.selectByPid(id);
    }


	@Override
	public List<PmsSkuStock> selectAllByPriceAndsp2(BigDecimal price,String sp2){
		 return pmsSkuStockMapper.selectAllByPriceAndsp2(price,sp2);
	}






}
