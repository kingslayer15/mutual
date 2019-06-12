package com.thumb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;
import com.thumb.mapper.ProductMapper;
import com.thumb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public PageInfo<ProductDto> listAllProduct(int start, int maxShow) {

        PageHelper.startPage(start,maxShow);

        List<ProductDto> products = productMapper.listAllProduct();

        PageInfo<ProductDto> productDtoPageInfo = new PageInfo<ProductDto>(products);

        return productDtoPageInfo;
    }

    public List<ProductCategoryDto> findAllCategory() {
        return productMapper.findAllCategory();
    }

    public List<ProductBrandDto> findAllBrand() {
        return productMapper.findAllBrand();
    }

    public List<ProductDto> findByCondition(ProductDto productDto) {
        return productMapper.findByCondition(productDto);
    }


    public List<ProductCategoryDto> listProductParent() {
        return productMapper.listProductParent();
    }

    public List<ProductCategoryDto> listProductChild(int parentid) {
        return productMapper.listProductChild(parentid);
    }

    public int deleteProductById(int id) {
        return productMapper.deleteProductById(id);
    }

    public ProductDto findProductById(int id) {
        return productMapper.findProductById(id);
    }

    public int addProduct(ProductDto productDto) {
        return productMapper.addProduct(productDto);
    }

    public int updateProductMsg(ProductDto productDto) {
        return productMapper.updateProductMsg(productDto);
    }

}
