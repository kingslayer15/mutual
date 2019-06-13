package com.thumb.controller;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;
import com.thumb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    /**
     * 分页查询所有商品信息
     * @param pageNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "listAllProduct",method = RequestMethod.GET)
    public Object listAllProduct(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo, Integer maxShowPage) {


        //最大显示行数数
        int maxShow = maxShowPage;

        PageInfo<ProductDto> products = productService.listAllProduct(pageNo, maxShow);


        //获取当前页 最大页  和数据 返回前端
/*        findByPageProductDto.setCurrentPage(products.getPageNum());
        findByPageProductDto.setTotalPage(products.getPages());
        findByPageProductDto.setProducts(products.getList());*/

        return products;
    }

    /**
     * 获取所有商品类型
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAllCategory",method = RequestMethod.GET)
    public Object findAllCategory(){
        List<ProductCategoryDto> productCategoryDtos = productService.findAllCategory();
        return productCategoryDtos;
    }

    /**
     * 获取所有品牌
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAllBrand",method = RequestMethod.GET)
    public Object findAllBrand(){
        List<ProductBrandDto> productBrandDtos = productService.findAllBrand();
        return productBrandDtos;
    }


    /**
     * 根据条件 分页查询所有信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findByCondition")
    public Object findByCondition(@RequestBody ProductDto productDto){

        System.err.println("页数：：：：："+productDto.getPageNo());
        System.err.println("上架状态：：：：："+productDto.getPublish_status());
        System.err.println("审核状态：：：：：："+productDto.getVerify_status());
        //最大显示行数数
//        int maxShow = 8;
        int maxShow = productDto.getMaxShowPage();
        int pageNo = productDto.getPageNo()==0?1:productDto.getPageNo();

        productDto.setPageNo(pageNo);

        PageInfo<ProductDto> products = productService.findByCondition(productDto, maxShow);

        return products;
        /*List<ProductDto> productDtos = productService.findByCondition(productDto);

        System.err.println(productDtos);
            return productDtos;*/

        }

    /**
     * 获取产品父类型
     */
    @ResponseBody
    @RequestMapping("listProductParent")
    public Object listProductParent(){
        List<ProductCategoryDto> productCategoryDtos = productService.listProductParent();
        return productCategoryDtos;
    }

    /**
     * 获取产品的子类型
     * @return
     */
    @ResponseBody
    @RequestMapping("listProductChild")
    public Object listProductChild(@RequestParam int parentid){
        List<ProductCategoryDto> productCategoryDtos = productService.listProductChild(parentid);
        return productCategoryDtos;
    }

    /**
     * 根据id删除商品
     */
    @ResponseBody
    @RequestMapping("deleteProductById")
    public Object deleteProductById(@RequestParam int id){
        int i = productService.deleteProductById(id);
        return i;
    }

    /**
     * 根据id查找商品
     */
    @ResponseBody
    @RequestMapping("findProductById")
    public Object findProductById(@RequestParam int id){
        ProductDto productDto = productService.findProductById(id);
        return productDto;
    }


    /**
     *添加商品
     * @param productDto
     * @return
     */
    @ResponseBody
    @RequestMapping("addProductMsg")
    public Object addProduct(@RequestBody ProductDto productDto){
        String pic = productDto.getPic();
        if (pic.length()>0){
            productDto.setPic("http://localhost:8080/static/upload/"+pic);
        }
        int i = productService.addProduct(productDto);
        return i;
    }

    /**
     * 修改商品信息
     * @param productDto
     * @return
     */
    @Transactional
    @ResponseBody
    @RequestMapping("updateProductMsg")
    public Object updateProductMsg(@RequestBody ProductDto productDto){
        System.err.println(productDto);
        int i = productService.updateProductMsg(productDto);
        return i;
    }



}
