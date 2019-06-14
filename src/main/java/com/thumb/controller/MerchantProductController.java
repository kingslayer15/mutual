package com.thumb.controller;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.MerchantProductDto;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;
import com.thumb.pojo.Merchant;
import com.thumb.service.MerchantProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MerchantProductController {
    @Autowired
    MerchantProductService merchantService;

    //获取商家id
     public int getMerchantId(HttpSession httpSession){
         Merchant merchant = (Merchant) httpSession.getAttribute("merchant");
         int merchantId = merchant.getId();
         return merchantId;
    }


    /**
     * 分页查询所有商品信息
     * @param pageNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "listAllMerchantProduct",method = RequestMethod.GET)
    public Object listAllProduct(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo, Integer maxShowPage, HttpSession httpSession) {



        //获取商家id
        int merchantId = getMerchantId(httpSession);

        //最大显示行数数
        int maxShow = maxShowPage;

        PageInfo<ProductDto> products = merchantService.listAllProduct(pageNo, maxShow,merchantId);


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
    @RequestMapping(value = "findAllMerchantCategory",method = RequestMethod.GET)
    public Object findAllCategory(){

        List<ProductCategoryDto> productCategoryDtos = merchantService.findAllCategory();
        return productCategoryDtos;
    }

    /**
     * 获取所有品牌
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAllMerchantBrand",method = RequestMethod.GET)
    public Object findAllBrand(){
        List<ProductBrandDto> productBrandDtos = merchantService.findAllBrand();
        return productBrandDtos;
    }


    /**
     * 根据条件 分页查询所有信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findMerchantProductByCondition")
    public Object findByCondition(@RequestBody MerchantProductDto productDto, HttpSession httpSession){

       /* System.err.println("页数：：：：："+productDto.getPageNo());
        System.err.println("上架状态：：：：："+productDto.getPublish_status());
        System.err.println("审核状态：：：：：："+productDto.getVerify_status());*/
        int merchantId = getMerchantId(httpSession);
        productDto.setMerchantId(merchantId);

        //最大显示行数数
//        int maxShow = 8;
        int maxShow = productDto.getMaxShowPage();
        int pageNo = productDto.getPageNo()==0?1:productDto.getPageNo();

        productDto.setPageNo(pageNo);

        PageInfo<ProductDto> products = merchantService.findByCondition(productDto, maxShow);

        return products;
        /*List<ProductDto> productDtos = merchantService.findByCondition(productDto);

        System.err.println(productDtos);
            return productDtos;*/

    }

    /**
     * 获取产品父类型
     */
    @ResponseBody
    @RequestMapping("listMerchantProductParent")
    public Object listProductParent(){
        List<ProductCategoryDto> productCategoryDtos = merchantService.listProductParent();
        return productCategoryDtos;
    }

    /**
     * 获取产品的子类型
     * @return
     */
    @ResponseBody
    @RequestMapping("listMerchantProductChild")
    public Object listProductChild(@RequestParam int parentid){
        List<ProductCategoryDto> productCategoryDtos = merchantService.listProductChild(parentid);
        return productCategoryDtos;
    }

    /**
     * 根据id删除商品
     */
    @ResponseBody
    @RequestMapping("deleteMerchantProductById")
    public Object deleteProductById(@RequestParam int shopId, HttpSession httpSession){
        int merchantId = getMerchantId(httpSession);

        int i = merchantService.deleteProductById(merchantId,shopId);
        return i;
    }

    /**
     * 根据id查找商品
     */
    @ResponseBody
    @RequestMapping("findMerchantProductById")
    public Object findProductById(@RequestParam int shopId, HttpSession httpSession){
        int merchantId = getMerchantId(httpSession);
        ProductDto productDto = merchantService.findProductById(merchantId,shopId);
        return productDto;
    }


    /**
     *添加商品
     * @param merchantDto
     * @return
     */
    @ResponseBody
    @RequestMapping("addMerchantProductMsg")
    public Object addProduct(@RequestBody MerchantProductDto merchantDto, HttpSession httpSession){
        int merchantId = getMerchantId(httpSession);
        merchantDto.setMerchantId(merchantId);


        String pic = merchantDto.getPic();
        if (pic.length()>0){
            merchantDto.setPic("http://localhost:8080/upload/"+pic);
        }
        int i = merchantService.addProduct(merchantDto);
        //添加到中间表
        if (i!=0){
          int j = merchantService.addMerchant_Shop(merchantDto);
          return j==0?"添加中间表成功":"添加中间表失败";
        }
        else {
            return i==0?"添加商品成功但中间表失败":"全部失败";
        }

    }

    /**
     * 修改商品信息
     * @param merchantDto
     * @return
     */
    @ResponseBody
    @RequestMapping("updateMerchantProductMsg")
    public Object updateProductMsg(@RequestBody MerchantProductDto merchantDto, HttpSession httpSession){
        int merchantId = getMerchantId(httpSession);
        merchantDto.setMerchantId(merchantId);

        /*int merchantId = merchantDto.getMerchantId();
        System.err.println("MerchantId::::"+merchantId);*/
        int i = merchantService.updateProductMsg(merchantDto);
        return i;
    }
}
