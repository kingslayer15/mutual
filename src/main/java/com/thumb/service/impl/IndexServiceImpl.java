package com.thumb.service.impl;

import com.thumb.mapper.IndexMapper;
import com.thumb.pojo.Brand;
import com.thumb.pojo.HomeAdvertise;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCategory;
import com.thumb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    IndexMapper indexMapper;

    /**
     *  获取正在推荐的广告
     * @return
     */

    @Override
    public List<HomeAdvertise> selectHomeAdvertise() {
        return indexMapper.selectHomeAdvertise();
    }

    @Override
    public List<PmsProduct> getName(String name) {

        return indexMapper.getName(name);
    }

    @Override
    public List<PmsProductCategory> getType() {
        return indexMapper.getType();
    }

    @Override
    public List<HomeAdvertise> getAdvertise() {
        return indexMapper.getAdvertise();
    }

    @Override
    public List<PmsProduct> getCategory(String name) {
        return indexMapper.getCategory(name);
    }
}
