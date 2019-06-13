package com.thumb.service;

import com.thumb.dto.PageName;

import com.thumb.pojo.HomeProduct;
import com.thumb.pojo.PmsProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewService {


    /**
     * 获取正在推荐的品牌
     * @return
     */
    List<HomeProduct> selectNewAll();


    /**
     * 修改排序值
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
     * 批量修改库数据
     * @param pageName
     * @return
     */
//    List<PmsProduct>   updateNewById(PageName pageName);



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



    void updateNewById_Newproduct(int id);

    int updateNewById_product(PageName pageName);

    List<PmsProduct> updateNewById(PageName pageName);

    int updateNewById_home(PmsProduct pmsProduct);

    /**
     * 条件查询新品库的所有没有推荐的新品
     * @param pageName
     * @return
     */
    List<PmsProduct> selectNewsAllNO_folioModal(PageName pageName);

    List<PmsProduct> SubjectIndex();

}
