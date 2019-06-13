package com.thumb.service;
import java.util.List;

import com.thumb.pojo.Merchant;
public interface MerchantService{


    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);



	Merchant selectOnebyall(Merchant merchant);


}
