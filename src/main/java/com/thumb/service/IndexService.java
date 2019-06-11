package com.thumb.service;


import com.thumb.pojo.HomeAdvertise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexService {


    List<HomeAdvertise> selectHomeAdvertise();
}
