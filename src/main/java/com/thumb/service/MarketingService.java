package com.thumb.service;

import com.thumb.dto.PageName;
import com.thumb.pojo.Brand;

import com.thumb.pojo.PmsProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MarketingService {


    /**
     * 获取正在推荐的品牌
     *
     * @return
     */
    List<Brand> selectBrandAll();

    /**
     * 修改品牌推荐排序值
     * @param Brand
     * @return
     */
    int updateBySort(Brand Brand);

    /**
     * 根据id删除品牌
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 查询品牌库的所有品牌
     * @return
     */
    List<Brand> selectPmsBrandsAll();

    /**
     * 条件查询
     * @param name
     * @return
     */
    List<Brand> getSelectBrand(String name);


    /**
     * 批量添加
     * @param pageName
     * @return
     */
    int updateMenuById(PageName pageName);

    /**
     * 查询指定品牌下的商品
     * @return
     */
    List<PmsProduct> getBrands(int id);


    List<PmsProduct> getSubject(int id);

    List<Brand> selectBrandAllFactory();

}
