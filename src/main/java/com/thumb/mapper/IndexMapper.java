package com.thumb.mapper;

import com.thumb.pojo.Brand;
import com.thumb.pojo.HomeAdvertise;
import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCategory;

import java.util.List;

public interface IndexMapper {




    List<HomeAdvertise> selectHomeAdvertise();

    List<PmsProduct> getName(String name);

    List<PmsProductCategory> getType();

    List<HomeAdvertise> getAdvertise();

    List<PmsProduct> getCategory(String name);
}
