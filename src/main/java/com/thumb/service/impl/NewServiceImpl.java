package com.thumb.service.impl;

import com.thumb.dto.PageName;
import com.thumb.mapper.NewMapper;
import com.thumb.pojo.CmsSubject;
import com.thumb.pojo.HomeProduct;
import com.thumb.pojo.PmsProduct;
import com.thumb.service.NewService;
import com.thumb.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NewServiceImpl implements NewService {

    @Autowired
    NewMapper newMapper;

    /**
     * 获取正在推荐的品牌
     * @return
     */
    @Override
    public List<HomeProduct> selectNewAll() {
        return newMapper.selectNewAll();
    }

    /**
     * 修改排序值
     * @param homeProduct
     * @return
     */
    @Override
    public int updateNewBySort(HomeProduct homeProduct) {
        return newMapper.updateNewBySort(homeProduct);
    }

    /**
     * 条件查询
     * @param name
     * @return
     */
    @Override
    public List<HomeProduct> getSelectNew(String name) {
        return newMapper.getSelectNew(name);
    }

    /**
     * 批量修改品牌库数据
     * @param pageName
     * @return
     */
    @Override
    public List<PmsProduct>   updateNewById(PageName pageName) {
        return newMapper.updateNewById(pageName);
    }
    /**
     * 批量修改品牌库数据
     * @param pmsProduct
     * @return
     */
    @Override
    public int updateNewById_home(PmsProduct pmsProduct){
        return newMapper.updateNewById_home(pmsProduct);
    }

    /**
     * 条件查询新品库的所有没有推荐的新品
     * @param pageName
     * @return
     */
    @Override
    public List<PmsProduct> selectNewsAllNO_folioModal(PageName pageName) {
        return newMapper.selectNewsAllNO_folioModal(pageName);
    }

    @Override
    public List<PmsProduct> SubjectIndex() {
        return newMapper.SubjectIndex();
    }

    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    @Override
    public int deleteNewById(int id) {
        return newMapper.deleteNewById(id);
    }

    /**
     * 查询品牌库的所有没有推荐的专题
     * @return
     */
    @Override
    public List<PmsProduct> selectNewsAll() {
        return newMapper.selectNewsAll();
    }



    @Override
    public void updateNewById_Newproduct(int id) {
        newMapper.updateNewById_Newproduct(id);
    }

    @Override
    public int updateNewById_product(PageName pageName ) {
         return newMapper.updateNewById_product(pageName);
    }
}
