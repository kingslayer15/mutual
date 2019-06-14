package com.thumb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.MerchantProductDto;
import com.thumb.dto.ProductBrandDto;
import com.thumb.dto.ProductCategoryDto;
import com.thumb.dto.ProductDto;
import com.thumb.mapper.MerchantProductMapper;
import com.thumb.service.MerchantProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantProductServiceImpl implements MerchantProductService {

    @Autowired
    MerchantProductMapper merchantMapper;

    public PageInfo<ProductDto> listAllProduct(int start, int maxShow, int merchantId) {

        PageHelper.startPage(start,maxShow);

        List<ProductDto> products = merchantMapper.listAllProduct(merchantId);

        PageInfo<ProductDto> productDtoPageInfo = new PageInfo<ProductDto>(products);

        return productDtoPageInfo;
    }

    public List<ProductCategoryDto> findAllCategory() {
        return merchantMapper.findAllCategory();
    }

    public List<ProductBrandDto> findAllBrand() {
        return merchantMapper.findAllBrand();
    }

    public PageInfo<ProductDto> findByCondition(MerchantProductDto productDto, int maxShow) {

        PageHelper.startPage(productDto.getPageNo(),maxShow);

        List<ProductDto> productDtos = merchantMapper.findByCondition(productDto);

        PageInfo<ProductDto> productDtoPageInfo = new PageInfo<ProductDto>(productDtos);

        return productDtoPageInfo;
    }


    public List<ProductCategoryDto> listProductParent() {
        return merchantMapper.listProductParent();
    }

    public List<ProductCategoryDto> listProductChild(int parentid) {
        return merchantMapper.listProductChild(parentid);
    }

    public int deleteProductById(int merchantId,int shopId) {
        return merchantMapper.deleteProductById(merchantId,shopId);
    }

    public ProductDto findProductById(int merchantId, int shopId) {
        return merchantMapper.findProductById(merchantId,shopId);
    }

    public int addProduct(MerchantProductDto merchantDto) {
        return merchantMapper.addProduct(merchantDto);
    }

    public int addMerchant_Shop(MerchantProductDto merchantDto) {
        return merchantMapper.addMerchant_Shop(merchantDto);
    }

    public int updateProductMsg(MerchantProductDto merchantDto) {
        return merchantMapper.updateProductMsg(merchantDto);
    }
}
