package com.thumb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.mapper.ProductCategoryMapper;
import com.thumb.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    public PageInfo<ProductCategoryDto> ListParentProductCategory(int start, int maxShow) {

        PageHelper.startPage(start,maxShow);
        List<ProductCategoryDto> productCategoryDtos = productCategoryMapper.ListParentProductCategory();

        PageInfo<ProductCategoryDto> ProductCategoryDtoPageInfo = new PageInfo<ProductCategoryDto>(productCategoryDtos);
        return ProductCategoryDtoPageInfo;
    }

    public List<ProductCategoryDto> listParentProductCategory() {
        return productCategoryMapper.ListParentProductCategory();
    }

    public int insertProductCategory(ProductCategoryDto productCategoryDto) {
        return productCategoryMapper.insertProductCategory(productCategoryDto);
    }

    public ProductCategoryDto lookProductCategoryById(int id) {
        return productCategoryMapper.lookProductCategoryById(id);
    }

    public int modifyProductCategoryById(ProductCategoryDto productCategoryDto) {
        return productCategoryMapper.modifyProductCategoryById(productCategoryDto);
    }

    public int removeProductCategoryById(int id) {
        return productCategoryMapper.removeProductCategoryById(id);
    }

    public List<ProductCategoryDto> findLowerById(int id) {
        return productCategoryMapper.findLowerById(id);
    }


}
