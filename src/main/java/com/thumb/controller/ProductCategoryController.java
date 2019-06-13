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
    public Object findAllProductCategory(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo, Integer maxShowPage){

        //最大显示行数数
        int maxShow = maxShowPage;

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

    /**
     * 根据id查找分类信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("lookProductCategoryById")
    public Object lookProductCategoryById(@RequestParam int id){
        ProductCategoryDto productCategoryDto = productCategoryService.lookProductCategoryById(id);
        return productCategoryDto;
    }

    /**
     * 根据id修改分类信息
     * @param productCategoryDto
     * @return
     */
    @ResponseBody
    @RequestMapping("modifyProductCategoryById")
    public Object modifyProductCategoryById(@RequestBody ProductCategoryDto productCategoryDto){
        int i = productCategoryService.modifyProductCategoryById(productCategoryDto);
        return i;
    }

    /**
     * 根据id删除分类信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("removeProductCategoryById")
    public Object removeProductCategoryById(@RequestParam int id){
        int i = productCategoryService.removeProductCategoryById(id);
        return i;
    }


    /**
     * 查看下级
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("findLowerById")
    public Object findLowerById(@RequestParam int id){
        List<ProductCategoryDto> productCategoryDtos = productCategoryService.findLowerById(id);
        return productCategoryDtos;
    }
}
