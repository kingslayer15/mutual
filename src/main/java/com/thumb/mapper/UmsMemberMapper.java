package com.thumb.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.util.Date;

import com.thumb.dto.UmsMemberDto;
import com.thumb.pojo.UmsMember;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    //生成dto专用
//    int insert(UmsMemberDto record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    /**
     * @param umsMemberDto 注册会员,插入用户名,密码,邮箱
     * @return
     */
    int insertReg(UmsMemberDto umsMemberDto);

    /**
     * 登录页面,通过用户名,密码,验证码登录到index.html
     * @param umsMemberDto 参数是dto
     * @return 返回的是会员对象
     */
    UmsMember selectOneByUsernameAndPassword(UmsMemberDto umsMemberDto);


    /**
     * 通过用户名查对象
     * @param username
     * @return
     */
    UmsMember selectOneByUsername(@Param("username")String username);


    UmsMember selectOneByRegemail(@Param("regemail")String regemail);





}