package com.thumb.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.mapper.MerchantMapper;
import com.thumb.pojo.Merchant;
import com.thumb.service.MerchantService;
@Service
public class MerchantServiceImpl implements MerchantService{

    @Resource
    private MerchantMapper merchantMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return merchantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Merchant record) {
        return merchantMapper.insert(record);
    }

    @Override
    public int insertSelective(Merchant record) {
        return merchantMapper.insertSelective(record);
    }

    @Override
    public Merchant selectByPrimaryKey(Integer id) {
        return merchantMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Merchant record) {
        return merchantMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Merchant record) {
        return merchantMapper.updateByPrimaryKey(record);
    }

	@Override
	public Merchant selectOnebyall(Merchant merchant){
		 return merchantMapper.selectOnebyall(merchant);
	}




}
