package com.thumb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;
import com.thumb.mapper.ProductBrandMapper;
import com.thumb.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductBrandServiceImpl implements ProductBrandService {

    @Autowired
    ProductBrandMapper productBrandMapper;

    public PageInfo<ProductBrandDto> listAllBrand(int start, int maxShow) {

        PageHelper.startPage(start,maxShow);

        List<ProductBrandDto> products = productBrandMapper.listAllProduct();

        PageInfo<ProductBrandDto> productDtoPageInfo = new PageInfo<ProductBrandDto>(products);

        return productDtoPageInfo;
    }

    public List<ProductBrandDto> findByCondition(String condition) {
        return productBrandMapper.findByCondition(condition);
    }

    public ProductBrandDto findBrandById(int id) {
        return productBrandMapper.findBrandById(id);
    }

    public int updateBrand(ProductBrandDto productBrandDto) {
        return productBrandMapper.updateBrand(productBrandDto);
    }
}
