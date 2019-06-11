package com.thumb.service.impl;

import com.thumb.mapper.IndexMapper;
import com.thumb.pojo.Brand;
import com.thumb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    IndexMapper indexMapper;

    /**
     *  获取正在推荐的品牌
     * @return
     */
    @Override
    public List<Brand> BrandIndex() {

        return indexMapper.BrandIndex();
    }
}
