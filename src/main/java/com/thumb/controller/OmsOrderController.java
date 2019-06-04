package com.thumb.controller;


import com.thumb.dto.OrderStatusDto;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.pojo.OmsOrder;
import com.thumb.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("admin")
public class OmsOrderController {

    @Autowired
    OmsOrderService omsOrderService;



    /**
     * 根据订单创建时间获取今日下单总数
     * @return
     * @throws ParseException
     */
    @ResponseBody
    @RequestMapping("orderCount")
    public Object orderCount() throws ParseException {


        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());

        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);


        Date starTime = calendar.getTime();


        calendar.add(Calendar.DAY_OF_MONTH,1);

        Date endTime = calendar.getTime();

        System.out.println("EndTime:" + endTime);

        Long aLong = omsOrderService.countByCreateTime(starTime,endTime);

        System.out.println("aloog:"+aLong);

        return aLong;
    }

    @RequestMapping("home")
    public String toAdminHome(){
        return "background/home";
    }


    /**
     * 返回今日的销售总额
     * @return
     */
    @ResponseBody
    @RequestMapping("sumAmount")
    public Object sumAmount(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());


        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);


        Date starTime = calendar.getTime();


        calendar.add(Calendar.DAY_OF_MONTH,1);

        Date endTime = calendar.getTime();

        BigDecimal totalAmount = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starTime, endTime);




        return totalAmount;
    }


    /**
     * 返回昨天的销售总额
     * @return
     */
    @ResponseBody
    @RequestMapping("sumAmountYesterday")
    public Object sumAmountY(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());


        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);

        calendar.add(Calendar.DAY_OF_MONTH,-1);

        Date starTime = calendar.getTime();


        calendar.add(Calendar.DAY_OF_MONTH,1);

        Date endTime = calendar.getTime();

        BigDecimal totalAmount = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starTime, endTime);

        return totalAmount;
    }

    @ResponseBody
    @RequestMapping("countByStatus")
    public Object countByStatus(){
        List<OrderStatusDto> orderStatusDtos = omsOrderService.countByStatus();
        return orderStatusDtos;
    }


@ResponseBody
    @RequestMapping("l")
    public Object tol(){

        System.out.println("test");
        return "WEB-INF/merchant/home";
    }

    @RequestMapping("login")
    public String tolgin(){
        return "WEB-INF/merchant/login";
    }

}
