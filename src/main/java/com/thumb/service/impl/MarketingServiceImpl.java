package com.thumb.service.impl;

import com.thumb.dto.PageName;
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

    /**
     * 修改品牌推荐排序值
     * @param Brand
     * @return
     */
    @Override
    public int updateBySort(Brand Brand) {
        return marketingMapper.updateBySort(Brand);
    }

    /**
     * 删除首页推荐品牌
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id) {
        return marketingMapper.deleteBrandById(id);
    }

    /**
     * 查询品牌库的所有品牌
     * @return
     */
    @Override
    public List<Brand> selectPmsBrandsAll() {
        return marketingMapper.selectPmsBrandsAll();
    }

    /**
     * 添加查询
     * @param name
     * @return
     */
    @Override
    public List<Brand> getSelectBrand(String name) {
        return marketingMapper.getSelectBrand(name);
    }


    /**
     * 批量添加数据
     * @param pageName
     * @return
     */
    @Override
    public int updateMenuById(PageName pageName) {

        return marketingMapper.updateMenuById(pageName);

    }
}
