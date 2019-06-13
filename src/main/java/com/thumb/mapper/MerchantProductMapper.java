package com.thumb.mapper;

import com.thumb.dto.MerchantProductDto;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;

import java.util.List;

public interface MerchantProductMapper {

    List<ProductDto> listAllProduct(int merchantId);

    List<ProductCategoryDto> findAllCategory();

    List<ProductBrandDto> findAllBrand();

    List<ProductDto> findByCondition(MerchantProductDto productDto);


    List<ProductCategoryDto> listProductParent();

    List<ProductCategoryDto> listProductChild(int parentid);

    int deleteProductById(int merchantId, int shopId);

    ProductDto findProductById(int merchantId, int shopId);

    int addProduct(MerchantProductDto merchantDto);
    int addMerchant_Shop(MerchantProductDto merchantDto);

    int updateProductMsg(MerchantProductDto merchantDto);

}
