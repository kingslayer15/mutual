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

        PageHelper.startPage(1, 4);

        List<HomeProduct> homeProducts = newService.getSelectNew(name);

        return new PageInfo(homeProducts);

    }


    /**
     * 批量添加专题
     * @return
     */
    @ResponseBody
    @RequestMapping("updateNewById")
    public Object updateNewById( @RequestBody PageName pageName) {

        return newService.updateNewById(pageName) != 0;

    }

    /**
     * 删除首页推荐专题
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteNewById")
    public Object deleteNewById(@RequestParam  int id) {
        return newService.deleteNewById(id);
    }



    /**
     * 查询新品库的所有没有推荐的专题
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


}
