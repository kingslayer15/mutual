package com.thumb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.Page;
import com.thumb.dto.PageName;

import com.thumb.pojo.HomeProduct;
import com.thumb.pojo.PmsProduct;
import com.thumb.service.NewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewController {

    @Autowired
    NewService newService;

    /**
     * 跳转进new.html
     * @return
     */
    @RequestMapping("new")
    public String toBrands() {
        return "background/new";
    }

    /**
     * 获取正在推荐的新品
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping("selectNewAll")
    public Object selectNewAll(@RequestBody Page page) {

        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<HomeProduct> homeProducts = newService.selectNewAll();

        return new PageInfo(homeProducts);
    }

    /**
     * 修改排序值
     * @param homeProducts
     * @return
     */
    @ResponseBody
    @RequestMapping("updateNowBySort")
    public Object updateNowBySort(@RequestBody HomeProduct homeProducts ) {

        return newService.updateNewBySort(homeProducts);
    }


    /**
     * 条件查询
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("getSelectNew")
    public Object getSelectNew(@RequestParam String name) {

        PageHelper.startPage(1, 5);

        List<HomeProduct> homeProducts = newService.getSelectNew(name);
        System.out.println(homeProducts);

        return new PageInfo(homeProducts);

    }


    /**
     * 批量添加新品
     * @return
     */
    @ResponseBody
    @RequestMapping("updateNewById")
    public Object updateNewById( @RequestBody PageName pageName) {

        List<PmsProduct> homeProducts = newService.updateNewById(pageName);

        int i1 = 0;
        for (int i = 0; i <= homeProducts.size()-1 ; i++) {
            i1 = newService.updateNewById_home(homeProducts.get(i));
            newService.updateNewById_product(homeProducts.get(i));
        }

        return i1;
    }

    /**
     * 删除首页推荐新品
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteNewById")
    public Object deleteNewById(@RequestParam  int id) {
        newService.updateNewById_Newproduct(id);
        return newService.deleteNewById(id);
    }



    /**
     * 查询新品库的所有没有推荐的新品
     * @param page
     * @returnR
     */
    @ResponseBody
    @RequestMapping("selectNewsAllNO")
    public Object selectNewsAll(@RequestBody Page page) {
        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<PmsProduct> homeProducts = newService.selectNewsAll();

        return new PageInfo(homeProducts);
    }
    /**
     * 条件查询新品库的所有没有推荐的新品
     * @param pageName
     * @returnR
     */
    @ResponseBody
    @RequestMapping("selectNewsAllNO_folioModal")
    public Object selectNewsAllNO_folioModal(@RequestBody PageName pageName) {
        //分页显示
        PageHelper.startPage(pageName.getPageNow(), pageName.getPageSize());

        List<PmsProduct> homeProducts = newService.selectNewsAllNO_folioModal(pageName);

        return new PageInfo(homeProducts);
    }





}
