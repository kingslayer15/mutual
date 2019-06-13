package com.thumb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.Page;
import com.thumb.dto.PageName;
import com.thumb.pojo.CmsSubject;
import com.thumb.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    /**
     * 跳转进subject.html
     * @return
     */
    @RequestMapping("subject")
    public String toBrands() {
        return "background/subject";
    }

    /**
     * 获取正在推荐的品牌
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping("selectSubjectAll")
    public Object selectSubjectAll(@RequestBody Page page) {

        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<CmsSubject> cmsSubjects = subjectService.selectSubjectAll();

        return new PageInfo(cmsSubjects);
    }

    /**
     * 修改排序值
     * @param cmsSubject
     * @return
     */
    @ResponseBody
    @RequestMapping("updateSubjectBySort")
    public Object updateSubjectBySort(@RequestBody  CmsSubject cmsSubject) {

        return subjectService.updateSubjectBySort(cmsSubject);
    }


    /**
     * 条件查询
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("getSelectSubject")
    public Object getSelectSubject(@RequestParam String name) {
        System.out.println(name);

        PageHelper.startPage(1, 5);

        List<CmsSubject> cmsSubjects = subjectService.getSelectSubject(name);

        System.out.println(cmsSubjects);

        return new PageInfo(cmsSubjects);

    }


    /**
     * 批量添加专题
     * @return
     */
    @ResponseBody
    @RequestMapping("updateSubjectById")
    public Object updateSubjectById( @RequestBody PageName pageName) {


        return subjectService.updateSubjectById(pageName) != 0;

    }

    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteSubjectById")
    public Object deleteSubjectById(@RequestParam  int id) {
        return subjectService.deleteSubjectById(id);
    }



    /**
     * 查询品牌库的所有没有推荐的专题
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping("selectSubjectsAll")
    public Object selectSubjectsAll(@RequestBody Page page) {
        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<CmsSubject> cmsSubjects = subjectService.selectSubjectsAll();

        return new PageInfo(cmsSubjects);
    }


    /**
     * 修改是否推送
     * @param pageName
     * @return
     */
    @ResponseBody
    @RequestMapping("selectSubjecShow")
    public Object selectSubjecShow(@RequestBody PageName pageName) {

        return subjectService.selectSubjecShow(pageName);
    }


    /**
     * 修改是否推送
     * @param pageName
     * @return
     */
    @ResponseBody
    @RequestMapping("selectBandsShow")
    public Object selectBandsShow(@RequestBody PageName pageName) {

        return subjectService.selectBandsShow(pageName);
    }


    /**
     * 修改是否推送
     * @param pageName
     * @return
     */
    @ResponseBody
    @RequestMapping("selectNewShow")
    public Object selectNewShow(@RequestBody PageName pageName) {

        return subjectService.selectNewShow(pageName);
    }





}
