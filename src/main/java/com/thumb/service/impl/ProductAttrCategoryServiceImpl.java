package com.thumb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductAttrCategoryDto;
import com.thumb.mapper.ProductAttrCategoryMapper;
import com.thumb.service.ProductAttrCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAttrCategoryServiceImpl implements ProductAttrCategoryService {
    @Autowired
    ProductAttrCategoryMapper productAttrCategoryMapper;

    public PageInfo<ProductAttrCategoryDto> findAllProductCategory(int start, int maxShow) {

        PageHelper.startPage(start,maxShow);

        List<ProductAttrCategoryDto> productAttrCategoryDtos = productAttrCategoryMapper.findAllProductCategory();

        PageInfo<ProductAttrCategoryDto> ProductAttrCategoryDtoPageInfo = new PageInfo<ProductAttrCategoryDto>(productAttrCategoryDtos);

        return ProductAttrCategoryDtoPageInfo;
    }

    public int addProductCategory(ProductAttrCategoryDto productAttrCategoryDto) {

        return productAttrCategoryMapper.addProductCategory(productAttrCategoryDto);
    }

    public int deleteCategoryById(int id) {
        return productAttrCategoryMapper.deleteCategoryById(id);
    }

    public ProductAttrCategoryDto findCategoryById(int id) {
        return productAttrCategoryMapper.findCategoryById(id);
    }

    public int editCategoryById(ProductAttrCategoryDto productAttrCategoryDto) {
        return productAttrCategoryMapper.editCategoryById(productAttrCategoryDto);
    }
}
