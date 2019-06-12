package com.thumb.mapper;

import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;

import java.util.List;

public interface ProductMapper {
    List<ProductDto> listAllProduct();

    List<ProductCategoryDto> findAllCategory();

    List<ProductBrandDto> findAllBrand();

    List<ProductDto> findByCondition(ProductDto productDto);


    List<ProductCategoryDto> listProductParent();

    List<ProductCategoryDto> listProductChild(int parentid);

    int deleteProductById(int id);

    ProductDto findProductById(int id);

    int addProduct(ProductDto productDto);

    int updateProductMsg(ProductDto productDto);
}
