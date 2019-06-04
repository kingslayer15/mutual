package com.thumb.service;
import java.util.List;

import com.thumb.pojo.UmsAdmin;
public interface UmsAdminService{


    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);



	UmsAdmin selectOnebyall(UmsAdmin umsAdmin);


}
