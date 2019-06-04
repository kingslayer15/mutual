package com.thumb.controller;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductDto;
import com.thumb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;


    @ResponseBody
    @RequestMapping(value = "listAllProduct",method = RequestMethod.GET)
    public Object listAllProduct(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo) {


        System.out.println(pageNo);
        //最大显示行数数
        int maxShow = 8;

        PageInfo<ProductDto> products = productService.listAllProduct(pageNo, maxShow);

        System.out.println("getList:"+products.getList());

        //获取当前页 最大页  和数据 返回前端
/*        findByPageProductDto.setCurrentPage(products.getPageNum());
        findByPageProductDto.setTotalPage(products.getPages());
        findByPageProductDto.setProducts(products.getList());*/

        return products;
    }
}
