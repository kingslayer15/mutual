package com.thumb.controller;

import com.thumb.pojo.PmsSkuStock;
import com.thumb.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class PmsSkuStockController {
    @Autowired
    PmsSkuStockService pmsSkuStockService;



    @RequestMapping("getVersion")
    @ResponseBody
    public Object getProductDetails(@RequestParam String productId) {
        System.out.println("getversion"+productId);
        Long pid = Long.valueOf(productId);
        List<PmsSkuStock> pmsSkuStocks = pmsSkuStockService.selectByPid(pid);
        if (pmsSkuStocks != null) {

            return pmsSkuStocks;
        }
        return false;

    }
    @RequestMapping("getColorByRom")
    @ResponseBody
    public Object getColorByRom(@RequestBody PmsSkuStock pmsSkuStock) {
        System.out.println("--------------------------------------------------------");
        System.out.println("pmsSkuStock = " + pmsSkuStock);
        BigDecimal price = pmsSkuStock.getPrice();

        String sp2 = pmsSkuStock.getSp2();
        List<PmsSkuStock> pmsSkuStocks = pmsSkuStockService.selectAllByPriceAndsp2(price,sp2);
        if (pmsSkuStocks != null) {
            System.out.println(pmsSkuStocks);
            return pmsSkuStocks;
        }
        return false;

    }
    @RequestMapping("getSumById")
    @ResponseBody
    public Object getSum(@RequestParam String id) {
        System.out.println(id);
        Long id1 = Long.valueOf(id);
        PmsSkuStock pmsSkuStocks = pmsSkuStockService.selectByPrimaryKey(id1);
        if (pmsSkuStocks != null) {
            System.out.println(pmsSkuStocks);
            return pmsSkuStocks;
        }
        return false;

    }
}
