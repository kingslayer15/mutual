package com.thumb.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.Page;
import com.thumb.pojo.Brand;
import com.thumb.service.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("background")
public class MarketingController {

    @Autowired
    private MarketingService marketingService;

    /**
     * 获取正在推荐的品牌
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectBrandAll", method = RequestMethod.POST)
    public Object selectBrandAll(@RequestBody Page page) {

        //分页显示
        PageHelper.startPage(page.getPageNow(), page.getPageSize());

        List<Brand> brands = marketingService.selectBrandAll();

        return new PageInfo(brands);
    }

    /**
     * 跳转进brands.html
     *
     * @return
     */
    @RequestMapping("brands")
    public String toBrands() {
        return "WEB-INF/background/brands";
    }


}
