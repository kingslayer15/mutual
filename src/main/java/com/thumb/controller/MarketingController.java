package com.thumb.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.Page;
import com.thumb.dto.PageName;
import com.thumb.pojo.Brand;

import com.thumb.service.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
public class MarketingController {

    @Autowired
    private MarketingService marketingService;

    /**
     * 跳转进brands.html
     * @return
     */
    @RequestMapping("brand")
    public String toBrands() {
        return "background/brands";
    }

    /**
     * 获取正在推荐的品牌
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping("selectBrandAll")
    public Object selectBrandAll(@RequestBody Page page) {

        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<Brand> brands = marketingService.selectBrandAll();

        return new PageInfo(brands);
    }

    /**
     * 修改品牌推荐排序值
     * @param Brand
     * @return
     */
    @ResponseBody
    @RequestMapping("updateBySort")
    public Object updateBySort(@RequestBody  Brand Brand) {
        return marketingService.updateBySort(Brand);
    }
    /**
     * 删除首页推荐品牌
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteById")
    public Object deleteById(@RequestParam  int id) {
        return marketingService.deleteById(id);
    }

    /**
     * 查询品牌库的所有品牌
     * @param page
     * @return
     */
    @ResponseBody
    @RequestMapping("selectPmsBrandsAll")
    public Object selectPmsBrandsAll(@RequestBody Page page) {
        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<Brand> brand = marketingService.selectPmsBrandsAll();

        return new PageInfo(brand);
    }

    /**
     * 查询品牌库的所有品牌
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("getSelectBrand")
    public Object getSelectBrand(@RequestParam String name) {

        PageHelper.startPage(1, 4);

        List<Brand> brands = marketingService.getSelectBrand(name);

        return new PageInfo(brands);

    }
    /**
     * 查批量添加品牌到首页品牌表
     * @return
     */
    @ResponseBody
    @RequestMapping("insertBrandById")
    public Object insertBrandById( @RequestBody  PageName pageName) {


        return marketingService.updateMenuById(pageName) != 0;

    }










}
