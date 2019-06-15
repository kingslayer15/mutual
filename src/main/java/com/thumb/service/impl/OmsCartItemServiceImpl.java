package com.thumb.service.impl;

import com.thumb.dto.OmsCartItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.OmsCartItem;
import com.thumb.mapper.OmsCartItemMapper;
import com.thumb.service.OmsCartItemService;

import java.util.List;

@Service
public class OmsCartItemServiceImpl implements OmsCartItemService{


    @Resource
    private OmsCartItemMapper omsCartItemMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsCartItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsCartItem record) {
        return omsCartItemMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsCartItem record) {
        return omsCartItemMapper.insertSelective(record);
    }

    @Override
    public OmsCartItem selectByPrimaryKey(Long id) {
        return omsCartItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsCartItem record) {
        return omsCartItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OmsCartItem> findByMemberId(Long memberId) {
        List<OmsCartItem> cartItem = omsCartItemMapper.findByMemberId(memberId);
        return cartItem;
    }

    @Override
    public int insertCart(OmsCartItemDto omsCartItemDto) {
        System.out.println("insertCart"+omsCartItemDto);
        return omsCartItemMapper.insertCart(omsCartItemDto);
    }


	@Override
	public OmsCartItem selectOneByAll(OmsCartItemDto omsCartItemDto){
		 return omsCartItemMapper.selectOneByAll(omsCartItemDto);
	}

    @Override
    public OmsCartItem selectOneByAll2(OmsCartItemDto omsCartItemDto) {
        return omsCartItemMapper.selectOneByAll2(omsCartItemDto);
    }

	@Override
	public int updateQuantityById(Integer updatedQuantity,Long id){
		 return omsCartItemMapper.updateQuantityById(updatedQuantity,id);
	}





}
