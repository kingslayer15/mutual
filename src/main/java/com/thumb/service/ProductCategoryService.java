package com.thumb.service;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryService {
    PageInfo<ProductCategoryDto> ListParentProductCategory(int start, int maxShow);

    List<ProductCategoryDto> listParentProductCategory();


    int insertProductCategory(ProductCategoryDto productCategoryDto);

    ProductCategoryDto lookProductCategoryById(int id);

    int modifyProductCategoryById(ProductCategoryDto productCategoryDto);

    int removeProductCategoryById(int id);

    List<ProductCategoryDto> findLowerById(int id);
}
