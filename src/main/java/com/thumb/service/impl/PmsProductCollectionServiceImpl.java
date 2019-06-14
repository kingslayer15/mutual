package com.thumb.service.impl;

import com.thumb.dto.OmsCartItemDto;
import com.thumb.pojo.PmsProduct;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.PmsProductCollection;
import com.thumb.mapper.PmsProductCollectionMapper;
import com.thumb.service.PmsProductCollectionService;

import java.util.List;

@Service
public class PmsProductCollectionServiceImpl implements PmsProductCollectionService{

    @Resource
    private PmsProductCollectionMapper pmsProductCollectionMapper;

    @Override
    public int insert(PmsProductCollection record) {
        return pmsProductCollectionMapper.insert(record);
    }

    @Override
    public int insertSelective(PmsProductCollection record) {
        return pmsProductCollectionMapper.insertSelective(record);
    }

    @Override
    public int insertCollection(OmsCartItemDto record) {
        System.out.println(record+"service");
        return pmsProductCollectionMapper.insertCollection(record);
    }

    @Override
    public List<PmsProduct> selectAllBymemberId(long memberId) {
        System.out.println("service"+memberId);
        return pmsProductCollectionMapper.selectAllBymemberId(memberId);
    }

	@Override
	public PmsProductCollection selectOneByAll(OmsCartItemDto omsCartItemDto){
		 return pmsProductCollectionMapper.selectOneByAll(omsCartItemDto);
	}

	@Override
	public int updateById(Integer id){
		 return pmsProductCollectionMapper.updateById(id);
	}

    @Override
    public int updateCollectionStatesFor1ById(Integer id) {
        return pmsProductCollectionMapper.updateCollectionStatesFor1ById(id);
    }


}
