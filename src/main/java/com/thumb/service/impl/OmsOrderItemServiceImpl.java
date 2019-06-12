package com.thumb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.OmsOrderItem;
import com.thumb.mapper.OmsOrderItemMapper;
import com.thumb.service.OmsOrderItemService;
@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService{

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrderItem record) {
        return omsOrderItemMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrderItem record) {
        return omsOrderItemMapper.insertSelective(record);
    }

    @Override
    public OmsOrderItem selectByPrimaryKey(Long id) {
        return omsOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrderItem record) {
        return omsOrderItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public String findOneProductAttrByProductId(Long productId) {
        String attr = omsOrderItemMapper.findOneProductAttrByProductId(productId);
        return attr;
    }

}
