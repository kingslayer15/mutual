package com.thumb.mapper;

import com.thumb.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryMapper {
    List<ProductCategoryDto> ListParentProductCategory();

    int insertProductCategory(ProductCategoryDto productCategoryDto);

    ProductCategoryDto lookProductCategoryById(int id);

    int modifyProductCategoryById(ProductCategoryDto productCategoryDto);

    int removeProductCategoryById(int id);

    List<ProductCategoryDto> findLowerById(int id);
}
