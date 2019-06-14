package com.thumb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.UmsMemberReceiveAddress;
import com.thumb.mapper.UmsMemberReceiveAddressMapper;
import com.thumb.service.UmsMemberReceiveAddressService;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService{

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberReceiveAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.insertSelective(record);
    }

    @Override
    public UmsMemberReceiveAddress selectByPrimaryKey(Long id) {
        return umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMemberReceiveAddress record) {
        return umsMemberReceiveAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UmsMemberReceiveAddress> findAll() {

        List<UmsMemberReceiveAddress> all = umsMemberReceiveAddressMapper.findAll();

        return all;
    }

    @Override
    public List<UmsMemberReceiveAddress> findByMemberId(Long memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.findByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
