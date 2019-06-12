package com.thumb.mapper;

import com.thumb.dto.ProductAttrCategoryDto;

import java.util.List;

public interface ProductAttrCategoryMapper {
    List<ProductAttrCategoryDto> findAllProductCategory();

    int addProductCategory(ProductAttrCategoryDto productAttrCategoryDto);

    int deleteCategoryById(int id);

    ProductAttrCategoryDto findCategoryById(int id);

    int editCategoryById(ProductAttrCategoryDto productAttrCategoryDto);
}
