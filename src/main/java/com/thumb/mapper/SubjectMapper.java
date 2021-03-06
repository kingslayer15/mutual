package com.thumb.mapper;

import com.thumb.dto.PageName;
import com.thumb.pojo.Brand;
import com.thumb.pojo.CmsSubject;

import java.util.List;

public interface SubjectMapper {
    /**
     * 获取正在推荐的品牌
     * @return
     */
    List<CmsSubject> selectSubjectAll();

    /**
     *  修改排序值
     * @param cmsSubject
     * @return
     */
    int updateSubjectBySort(CmsSubject cmsSubject);

    /**
     * 条件查询
     * @param name
     * @return
     */
    List<CmsSubject> getSelectSubject(String name);

    /**
     * 批量修改品牌库数据
     * @param pageName
     * @return
     */
    int updateSubjectById(PageName pageName);


    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    int deleteSubjectById(int id);

    /**
     * 查询品牌库的所有没有推荐的专题
     * @return
     */
    List<CmsSubject> selectSubjectsAll();

    int selectSubjecShow(PageName pageName);

    List<CmsSubject> selectSubjectAllShow();

    int selectBandsShow(PageName pageName);

    int selectNewShow(PageName pageName);
}
