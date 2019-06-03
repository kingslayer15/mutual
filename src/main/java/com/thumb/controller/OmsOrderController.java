package com.thumb.controller;


import com.thumb.mapper.OmsOrderMapper;
import com.thumb.pojo.OmsOrder;
import com.thumb.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Calendar calendar = simpleDateFormat.getCalendar();



        calendar.setTime(new Date());

        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);


        Date starTime = calendar.getTime();

        System.out.println("StarTime" + starTime);

        calendar.add(Calendar.DAY_OF_MONTH,1);

        Date endTime = calendar.getTime();

        System.out.println("EndTime:" + endTime);

        Long aLong = omsOrderService.countByCreateTime(starTime,endTime);

        System.out.println("aloog:"+aLong);

        return aLong;
    }

    @RequestMapping("home")
    public String toAdminHome(){
        return "WEB-INF/background/home";
    }

}
