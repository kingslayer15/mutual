package com.thumb.service.impl;
import java.util.List;

import com.thumb.utility.MD5Utils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.UmsAdmin;
import com.thumb.mapper.UmsAdminMapper;
import com.thumb.service.UmsAdminService;
@Service
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UmsAdmin record) {
        return umsAdminMapper.insert(record);
    }

    @Override
    public int insertSelective(UmsAdmin record) {
        return umsAdminMapper.insertSelective(record);
    }

    @Override
    public UmsAdmin selectByPrimaryKey(Long id) {
        return umsAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdmin record) {
        return umsAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsAdmin record) {
        return umsAdminMapper.updateByPrimaryKey(record);
    }

	@Override
	public UmsAdmin selectOnebyall(UmsAdmin umsAdmin){
        umsAdmin.setPassword(MD5Utils.myEncode(umsAdmin.getPassword()));
        System.out.println(umsAdmin);
		 return umsAdminMapper.selectOnebyall(umsAdmin);
	}




}
