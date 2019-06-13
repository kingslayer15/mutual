package com.thumb.service.impl;

import com.thumb.dto.PageName;
import com.thumb.mapper.SubjectMapper;
import com.thumb.pojo.Brand;
import com.thumb.pojo.CmsSubject;
import com.thumb.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectMapper subjectMapper;

    /**
     * 获取正在推荐的品牌
     * @return
     */
    @Override
    public List<CmsSubject> selectSubjectAll() {
        return subjectMapper.selectSubjectAll();
    }

    /**
     * 修改排序值
     * @param cmsSubject
     * @return
     */
    @Override
    public int updateSubjectBySort(CmsSubject cmsSubject) {
        return subjectMapper.updateSubjectBySort(cmsSubject);
    }

    /**
     * 条件查询
     * @param name
     * @return
     */
    @Override
    public List<CmsSubject> getSelectSubject(String name) {
        return subjectMapper.getSelectSubject(name);
    }

    /**
     * 批量修改品牌库数据
     * @param pageName
     * @return
     */
    @Override
    public int updateSubjectById(PageName pageName) {
        return subjectMapper.updateSubjectById(pageName);
    }

    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    @Override
    public int deleteSubjectById(int id) {
        return subjectMapper.deleteSubjectById(id);
    }

    /**
     * 查询品牌库的所有没有推荐的专题
     * @return
     */
    @Override
    public List<CmsSubject> selectSubjectsAll() {
        return subjectMapper.selectSubjectsAll();
    }

    @Override
    public int selectSubjecShow(PageName pageName) {

        return subjectMapper.selectSubjecShow(pageName);
    }

    @Override
    public List<CmsSubject> selectSubjectAllShow() {
        return subjectMapper.selectSubjectAllShow();
    }

    @Override
    public int selectBandsShow(PageName pageName) {
        return subjectMapper.selectBandsShow(pageName);
    }

    @Override
    public int selectNewShow(PageName pageName) {
        return subjectMapper.selectNewShow(pageName);
    }
}
