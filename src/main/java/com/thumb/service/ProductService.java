package com.thumb.service;

import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;

import java.util.List;


public interface ProductService {
    PageInfo<ProductDto> listAllProduct(int start, int maxShow);

    List<ProductCategoryDto> findAllCategory();

    List<ProductBrandDto> findAllBrand();

    PageInfo<ProductDto> findByCondition(ProductDto productDto, int maxShow);

    List<ProductCategoryDto> listProductParent();

    List<ProductCategoryDto> listProductChild(int parentid);

    int deleteProductById(int id);

    ProductDto findProductById(int id);

    int addProduct(ProductDto productDto);

    int updateProductMsg(ProductDto productDto);

}
