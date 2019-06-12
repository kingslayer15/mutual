package com.thumb.mapper;

import com.thumb.dto.ProductBrandDto;

import java.util.List;

public interface ProductBrandMapper {
    List<ProductBrandDto> listAllProduct();

    List<ProductBrandDto> findByCondition(String condition);

    ProductBrandDto findBrandById(int id);

    int updateBrand(ProductBrandDto productBrandDto);
}
