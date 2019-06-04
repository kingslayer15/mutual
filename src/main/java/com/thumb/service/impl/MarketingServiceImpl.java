package com.thumb.service.impl;

import com.thumb.mapper.MarketingMapper;
import com.thumb.pojo.Brand;
import com.thumb.service.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketingServiceImpl implements MarketingService {


    @Autowired
    MarketingMapper marketingMapper;

    /**
     * 获取正在推荐的品牌
     *
     * @return
     */
    @Override
    public List<Brand> selectBrandAll() {
        return marketingMapper.selectBrandAll();
    }
}
