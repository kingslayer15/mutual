package com.thumb.mapper;
import org.apache.ibatis.annotations.Param;

import com.thumb.pojo.Merchant;

public interface MerchantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
    Merchant selectOnebyall(Merchant merchant);



}