package com.thumb.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.thumb.pojo.UmsMemberReceiveAddress;

public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> findAll();

    List<UmsMemberReceiveAddress> findByMemberId(@Param("memberId")Long memberId);




}