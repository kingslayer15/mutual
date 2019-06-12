package com.thumb.controller;

import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService;


    /**
     * 分页查询所有一级类型
     * @param pageNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "ListParentProductCategory",method = RequestMethod.GET)
    public Object findAllProductCategory(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo){

        //最大显示行数数
        int maxShow = 5;

        PageInfo<ProductCategoryDto> productCategoryDtos = productCategoryService.ListParentProductCategory(pageNo,maxShow);

        return productCategoryDtos;
    }

    /**
     * 直接查询所有一级分类类型
     * @return
     */
    @ResponseBody
    @RequestMapping("listParentProductCategory")
    public Object listParentProductCategory(){
        List<ProductCategoryDto> productCategoryDtos = productCategoryService.listParentProductCategory();
        return productCategoryDtos;
    }

    /**
     * 添加商品分类
     * @param productCategoryDto
     * @return
     */
    @ResponseBody
    @RequestMapping("insertProductCategory")
    public Object insertProductCategory(@RequestBody ProductCategoryDto productCategoryDto){
        int i = productCategoryService.insertProductCategory(productCategoryDto);
        return i;
    }
}
