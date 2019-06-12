package com.thumb.service;


import com.thumb.pojo.HomeAdvertise;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {


    List<HomeAdvertise> selectHomeAdvertise();

    List<PmsProduct> getName(String name);

    List<PmsProductCategory> getType();

}
