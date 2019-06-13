package com.thumb.service;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.MerchantProductDto;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;

import java.util.List;

public interface MerchantProductService {
    PageInfo<ProductDto> listAllProduct(int start, int maxShow, int merchantId);

    List<ProductCategoryDto> findAllCategory();

    List<ProductBrandDto> findAllBrand();

    PageInfo<ProductDto> findByCondition(MerchantProductDto productDto, int maxShow);

    List<ProductCategoryDto> listProductParent();

    List<ProductCategoryDto> listProductChild(int parentid);

    int deleteProductById(int merchantId, int shopId);

    ProductDto findProductById(int merchantId, int shopId);

    //添加商家商品
    int addProduct(MerchantProductDto merchantDto);
    int addMerchant_Shop(MerchantProductDto merchantDto);



    int updateProductMsg(MerchantProductDto merchantDto);


}
