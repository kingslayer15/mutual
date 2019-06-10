package com.thumb.mapper;

import com.thumb.dto.PageName;
import com.thumb.pojo.Brand;
import com.thumb.pojo.PmsProduct;


import java.util.List;

public interface MarketingMapper {

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
     * 删除指定品牌
     * @param id
     * @return
     */
    int deleteBrandById(int id);

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
     * 批量修改品牌库数据
     * @param pageName
     * @return
     */
    int updateMenuById(PageName pageName);


    /**
     *  查询指定品牌下的商品
     * @param id
     * @return
     */
    List<PmsProduct> getBrands(int id);

    List<PmsProduct> getSubject(int id);
}
