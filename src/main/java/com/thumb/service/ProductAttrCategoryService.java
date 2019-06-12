package com.thumb.service;

import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductAttrCategoryDto;

public interface ProductAttrCategoryService {

    PageInfo<ProductAttrCategoryDto> findAllProductCategory(int start, int maxShow);

    int addProductCategory(ProductAttrCategoryDto productAttrCategoryDto);

    int deleteCategoryById(int id);

    ProductAttrCategoryDto findCategoryById(int id);

    int editCategoryById(ProductAttrCategoryDto productAttrCategoryDto);
}
