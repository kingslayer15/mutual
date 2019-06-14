package com.thumb.service;

import com.thumb.pojo.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberReceiveAddressService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> findAll();

    List<UmsMemberReceiveAddress> findByMemberId(Long memberId);

}
