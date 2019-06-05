package com.thumb.controller;


import com.thumb.dto.OrderStatusDto;
import com.thumb.service.OmsOrderService;
import com.thumb.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("admin")
public class AdminMainController {

    @Autowired
    OmsOrderService omsOrderService;

    @Autowired
    PmsProductService pmsProductService;



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

        Long aLong = omsOrderService.countByCreateTime(starTime,endTime);



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
    @RequestMapping("countByConfirm")
    public Object countByConfirm(){

        BigDecimal bigDecimal = omsOrderService.countByConfirm();


        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping("countByLowStock")
    public Object countByLowStock( ){

        BigDecimal bigDecimal = pmsProductService.countByLowStock();

        return bigDecimal;
    }

    /**
     * 根据申请状态返回退货订单的个数
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "countByReturnApply",method = RequestMethod.GET)
    public Object countByReturnApplyStatus(@RequestParam Integer status){

        BigDecimal bigDecimal = omsOrderService.countByReturnApply(status);

        return bigDecimal;
    }


    @ResponseBody
    @RequestMapping("countByEndTime")
    public Object countByEndTime(){

        BigDecimal bigDecimal = pmsProductService.countByEndTime();

        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping("countByPublishStatus0")
    public Object countByPublishStatus0(){

        BigDecimal bigDecimal = pmsProductService.countByPublishStatus(0);

        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping("countByPublishStatus1")
    public Object countByPublishStatus1(){

        BigDecimal bigDecimal = pmsProductService.countByPublishStatus(1);

        return bigDecimal;
    }
    @ResponseBody
    @RequestMapping("countAll")
    public Object countAll(){

        BigDecimal bigDecimal = pmsProductService.countAll();

        return bigDecimal;
    }

}
