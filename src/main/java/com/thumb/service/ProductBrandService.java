package com.thumb.service;

import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;

import java.util.List;

public interface ProductBrandService {

    PageInfo<ProductBrandDto> listAllBrand(int start, int maxShow);

    List<ProductBrandDto> findByCondition(String condition);

    ProductBrandDto findBrandById(int id);

    int updateBrand(ProductBrandDto productBrandDto);

    int addBrand(ProductBrandDto productBrandDto);

    int deleteBrandById(int id);
}
