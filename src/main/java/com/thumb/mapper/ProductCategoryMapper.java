package com.thumb.mapper;

import com.thumb.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryMapper {
    List<ProductCategoryDto> ListParentProductCategory();

    int insertProductCategory(ProductCategoryDto productCategoryDto);

    public ProductCategoryDto lookProductCategoryById(int id);

    public int modifyProductCategoryById(ProductCategoryDto productCategoryDto);

    public int removeProductCategoryById(int id);

    public List<ProductCategoryDto> findLowerById(int id);
}
