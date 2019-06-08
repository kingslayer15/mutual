package com.thumb.mapper;

import com.thumb.dto.PageName;
import com.thumb.pojo.HomeProduct;
import com.thumb.pojo.PmsProduct;

import java.util.List;

public interface NewMapper {
    /**
     * 获取正在推荐的品牌
     * @return
     */
    List<HomeProduct> selectNewAll();

    /**
     *  修改排序值
     * @param homeProduct
     * @return
     */
    int updateNewBySort(HomeProduct homeProduct);

    /**
     * 条件查询
     * @param name
     * @return
     */
    List<HomeProduct> getSelectNew(String name);

    /**
     * 批量修改品牌库数据
     * @param pageName
     * @return
     */
    int updateNewById(PageName pageName);


    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    int deleteNewById(int id);

    /**
     * 查询品牌库的所有没有推荐的专题
     * @return
     */
    List<PmsProduct> selectNewsAll();
}
