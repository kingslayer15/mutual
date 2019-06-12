package com.thumb.controller;

import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductAttrCategoryDto;
import com.thumb.service.ProductAttrCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductAttrCategoryController {

    @Autowired
    ProductAttrCategoryService productAttrCategoryService;

    /**
     * 分页显示所有商品类型
     * @param pageNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAllProductCategory",method = RequestMethod.GET)
    public Object findAllProductCategory(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo){

        //最大显示行数数
        int maxShow = 5;

        PageInfo<ProductAttrCategoryDto> productAttrCategoryDtos = productAttrCategoryService.findAllProductCategory(pageNo,maxShow);

        return productAttrCategoryDtos;
    }

    /**
     * 添加商品类型
     * @param productAttrCategoryDto
     * @return
     */
    @ResponseBody
    @RequestMapping("addProductCategory")
    public Object addProductCategory(@RequestBody ProductAttrCategoryDto productAttrCategoryDto){
        int i = productAttrCategoryService.addProductCategory(productAttrCategoryDto);
        return i;
    }

    /**
     * 删除商品类型
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteCategoryById")
    public Object deleteCategoryById(@RequestParam int id){
        int i = productAttrCategoryService.deleteCategoryById(id);
        return i;
    }


    /**
     * 根据id查询商品类型
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("findCategoryById")
    public Object findCategoryById(@RequestParam int id){
        ProductAttrCategoryDto productAttrCategoryDto = productAttrCategoryService.findCategoryById(id);
        return productAttrCategoryDto;
    }


    /**
     * 根据id修改商品类型
     * @param productAttrCategoryDto
     * @return
     */
    @ResponseBody
    @RequestMapping("editCategoryById")
    public Object editCategoryById(@RequestBody ProductAttrCategoryDto productAttrCategoryDto){
       int i = productAttrCategoryService.editCategoryById(productAttrCategoryDto);
       return i;
    }

}
