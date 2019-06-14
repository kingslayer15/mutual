package com.thumb.controller;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.PagaId;
import com.thumb.dto.PageName;
import com.thumb.pojo.Brand;
import com.thumb.pojo.HomeProduct;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.UmsMember;
import com.thumb.service.IndexService;
import com.thumb.service.MarketingService;
import com.thumb.service.NewService;
import com.thumb.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {


    @Autowired
    IndexService indexService;

    @Autowired
    SubjectService subjectService;

    @Autowired
    private MarketingService marketingService;

    @Autowired
    NewService newService;


    /**
     * 获取正在推荐的品牌
     * @return
     */
    @ResponseBody
    @RequestMapping("BrandIndex")
    public Object BrandIndex() {

        return marketingService.selectBrandAllFactory();
    }
    /**
     * 获取正在推荐的专题
     * @return
     */
    @ResponseBody
    @RequestMapping("SubjectIndex")
    public Object SubjectIndex() {

        return subjectService.selectSubjectAllShow();
    }
    /**
     * 获取正在推荐的新品
     * @return
     */
    @ResponseBody
    @RequestMapping("NewIndex")
    public Object NewIndex() {

        return newService.SubjectIndexHome();
    }

    /**
     * 获取正在推荐的品牌
     * @param pageId
     * @return
     */
    @ResponseBody
    @RequestMapping("getBrands")
    public Object getBrands(@RequestBody PagaId pageId) {


        //分页显示
        PageHelper.startPage(pageId.getPageNow(), pageId.getPageSize());

        List<PmsProduct> pmsProducts = marketingService.getBrands(pageId.getId());


        return new PageInfo(pmsProducts);
    }

    /**
     * 获取正在推荐的品牌
     * @param pageId
     * @return
     */
    @ResponseBody
    @RequestMapping("getSubject")
    public Object getSubject(@RequestBody PagaId pageId) {


        //分页显示
        PageHelper.startPage(pageId.getPageNow(), pageId.getPageSize());

        List<PmsProduct> pmsProducts = marketingService.getSubject(pageId.getId());


        return new PageInfo(pmsProducts);
    }
    /**
     * 获取正在推荐的品牌
     * @return
     */
    @ResponseBody
    @RequestMapping("selectHomeAdvertise")
    public Object selectHomeAdvertise() {

        return indexService.selectHomeAdvertise();
    }
    /**
     * 获取正在推荐的品牌
     * @return
     */
    @ResponseBody
    @RequestMapping("selectHomeNew")
    public Object selectHomeNew() {

        return newService.SubjectIndex();
    }
    /**
     * 条件搜索
     * @return
     */
    @ResponseBody
    @RequestMapping("getName")
    public Object getName(@RequestBody PageName pageName) {

        PageHelper.startPage(pageName.getPageNow(), pageName.getPageSize());

        List<PmsProduct> name = indexService.getName(pageName.getName());
        System.out.println(name);

        return new PageInfo(name);

    }
    /**
     * 商品种类查询
     * @return
     */
    @ResponseBody
    @RequestMapping("getType")
    public Object getType() {

        return indexService.getType();

    }
    /**
     * 商品种类查询
     * @return
     */
    @ResponseBody
    @RequestMapping("getAdvertise")
    public Object getAdvertise() {

        return indexService.getAdvertise();

    }

    @ResponseBody
    @RequestMapping(value = "getMember",method = RequestMethod.GET)
    public Object getMenberId(HttpSession httpSession){
        UmsMember umsMember = (UmsMember)httpSession.getAttribute("umsMember");

        return umsMember;
    }



    /**
     * 跳转进subject.html
     * @return
     */
    @RequestMapping("/")
    public String toBrands() {
        return "main/login";
    }




    @ResponseBody
    @RequestMapping("deleteCookic")
    public Object deleteCookic(HttpSession httpSession){

        httpSession.setAttribute("umsMember",null);

        Cookie cookie = new Cookie("username", "00");
        Cookie cookie2 = new Cookie("password", "00");

        cookie.setMaxAge(0);
        cookie2.setMaxAge(0);
        System.out.println(123);

        return true;
    }




}
