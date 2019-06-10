package com.thumb.service;

import com.thumb.pojo.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {

    /**
     * 获取正在推荐的品牌
     * @return
     */
    List<Brand> BrandIndex();
}
