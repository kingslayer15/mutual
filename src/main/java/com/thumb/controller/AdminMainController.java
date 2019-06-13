package com.thumb.controller;


import com.thumb.dto.DateDto;
import com.thumb.dto.EchartsDto;
import com.thumb.dto.OrderStatusDto;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.service.OmsOrderService;
import com.thumb.service.PmsProductService;
import com.thumb.service.UmsMemberService;
import com.thumb.utility.InitDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @Autowired
    UmsMemberService umsMemberService;

    @Autowired
    OmsOrderMapper omsOrderMapper;


    /**
     * 根据订单创建时间获取今日下单总数
     * @return
     * @throws ParseException
     */
    @ResponseBody
    @RequestMapping("orderCount")
    public Object orderCount() throws ParseException {


        ArrayList<Date> initDates = InitDateUtils.getInitDayDates(0, 1);

        Date starTime = initDates.get(0);
        Date endTime = initDates.get(1);

        BigDecimal bigDecimal = omsOrderService.countByCreateTime(starTime,endTime);



        return bigDecimal;
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
        ArrayList<Date> initDates = InitDateUtils.getInitDayDates(0, 1);

        Date starTime = initDates.get(0);
        Date endTime = initDates.get(1);



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


        ArrayList<Date> initDates = InitDateUtils.getInitDayDates(-1, 1);

        Date starTime = initDates.get(0);
        Date endTime = initDates.get(1);





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
    public Object countProductAll(){

        BigDecimal bigDecimal = pmsProductService.countAll();

        return bigDecimal;
    }


    @ResponseBody
    @RequestMapping(value = "countByCreateTime",method = RequestMethod.GET)
    public Object countByCreateTime(@RequestParam int dayNum){


        BigDecimal bigDecimal = umsMemberService.countByCreateTime(dayNum);

        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping(value = "countByCreateTimeMonth")
    public Object countByCreateTimeMonth(){

        BigDecimal bigDecimal = umsMemberService.countByCreateTimeMonth();

        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping(value = "countMemberAll")
    public Object countMemberAll(){

        Long bigDecimal = umsMemberService.countAll();

        return bigDecimal;
    }


    @ResponseBody
    @RequestMapping(value = "countOrderByCreateTimeThisMonth")
    public Object countOrderByCreateTime(HttpServletRequest httpServletRequest){
        ArrayList<Date> initMonthDates = InitDateUtils.getInitMonthDates(0);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);

        BigDecimal bigDecimal = omsOrderService.countByCreateTime(starDate,endDate);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("thisMonthOrder",bigDecimal);
        return bigDecimal;
    }

    @ResponseBody
    @RequestMapping(value = "countOrderByCreateTimeLastMonth")
    public Object countOrderByCreateTimeMonth(HttpServletRequest httpServletRequest){


        ArrayList<Date> initMonthDates = InitDateUtils.getInitMonthDates(-1);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);

        BigDecimal bigDecimal = omsOrderService.countByCreateTime(starDate,endDate);

        HttpSession session = httpServletRequest.getSession();

        BigDecimal thisMonthOrder = (BigDecimal)session.getAttribute("thisMonthOrder");

        BigDecimal lastMonth;
        if (bigDecimal.compareTo(new BigDecimal(0)) == 0){
            return 0;
        }else {
            lastMonth = thisMonthOrder.subtract(bigDecimal).divide(bigDecimal);        }
        return lastMonth;
    }

    @ResponseBody
    @RequestMapping(value = "countOrderByCreateTimeWeek")
    public Object countOrderByCreateTimeWeek(HttpServletRequest httpServletRequest){

        ArrayList<Date> initMonthDates = InitDateUtils.getInitWeekDates(0);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);

        BigDecimal bigDecimal = omsOrderService.countByCreateTime(starDate,endDate);

        if (bigDecimal != null) {

            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("thisWeekOrder",bigDecimal);
            return bigDecimal;
        }else {
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping(value = "countOrderByCreateTimeLastWeek")
    public Object countOrderByCreateTimeLastWeek(HttpServletRequest httpServletRequest){


        ArrayList<Date> initWeekDates = InitDateUtils.getInitWeekDates(-1);

        Date starDate = initWeekDates.get(0);
        Date endDate = initWeekDates.get(1);


        BigDecimal bigDecimal = omsOrderService.countByCreateTime(starDate,endDate);


        HttpSession session = httpServletRequest.getSession();

        BigDecimal lastWeek;

        BigDecimal thisWeekOrder = (BigDecimal)session.getAttribute("thisWeekOrder");

        if (thisWeekOrder == null){
            return 0;
        }

        if (bigDecimal.compareTo(new BigDecimal(0)) == 0){
            return 0;
        }else {
            lastWeek = thisWeekOrder.subtract(bigDecimal).divide(bigDecimal);
        }


        return lastWeek;
    }

    @ResponseBody
    @RequestMapping(value = "sumAmountThisMonth")
    public Object sumAmountThisMonth(HttpServletRequest httpServletRequest){


        ArrayList<Date> initMonthDates = InitDateUtils.getInitMonthDates(0);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);


        BigDecimal bigDecimal = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starDate,endDate);

        if (bigDecimal != null) {

            HttpSession session = httpServletRequest.getSession();

            session.setAttribute("thisMonthAmount", bigDecimal);
            return bigDecimal;
        }else {
            return 0;
        }

    }

    @ResponseBody
    @RequestMapping(value = "sumAmountLastMonth")
    public Object sumAmountLastMonth(HttpServletRequest httpServletRequest){


        ArrayList<Date> initMonthDates = InitDateUtils.getInitMonthDates(-1);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);

        BigDecimal bigDecimal = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starDate,endDate);

        HttpSession session = httpServletRequest.getSession();

        BigDecimal lastMonth;

        BigDecimal thisMonthAmount = (BigDecimal)session.getAttribute("thisMonthAmount");

        if (thisMonthAmount == null){
            return 0;
        }
        if (bigDecimal == null){
            return 0;
        }

        if (bigDecimal.compareTo(new BigDecimal(0)) == 0){
            return 0;
        }else {
            lastMonth = thisMonthAmount.subtract(bigDecimal).divide(bigDecimal);
        }




        return lastMonth;
    }


    @ResponseBody
    @RequestMapping(value = "sumAmountThisWeek")
    public Object sumAmountThisWeek(HttpServletRequest httpServletRequest){

        ArrayList<Date> initMonthDates = InitDateUtils.getInitWeekDates(0);

        Date starDate = initMonthDates.get(0);
        Date endDate = initMonthDates.get(1);

        BigDecimal bigDecimal = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starDate,endDate);

        if (bigDecimal != null) {

            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("thisWeekAmount",bigDecimal);
            return bigDecimal;
        }else {
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping(value = "sumAmountLastWeek")
    public Object sumAmountLastWeek(HttpServletRequest httpServletRequest){


        ArrayList<Date> initWeekDates = InitDateUtils.getInitWeekDates(-1);

        Date starDate = initWeekDates.get(0);
        Date endDate = initWeekDates.get(1);


        BigDecimal bigDecimal = omsOrderService.findSumTotalAmountByStatusAndCreateTimeBetween(starDate,endDate);


        HttpSession session = httpServletRequest.getSession();

        BigDecimal lastWeek;

        BigDecimal thisWeekAmount = (BigDecimal)session.getAttribute("thisWeekAmount");

        if (thisWeekAmount == null){
            return 0;
        }

        if (bigDecimal == null){
            return 0;
        }

        if (bigDecimal.compareTo(new BigDecimal(0)) == 0){
            return 0;
        }else {
            lastWeek = thisWeekAmount.subtract(bigDecimal).divide(bigDecimal);
        }


        return lastWeek;
    }


    @ResponseBody
    @RequestMapping("/getEchartsData")
    public Object echartsData(){

        List<DateDto> dateDtos = omsOrderMapper.selectByDate("2019","06");
        EchartsDto echartsDto = new EchartsDto();

        ArrayList<String> dates = new ArrayList<>();

        ArrayList<String> counts = new ArrayList<>();

        Calendar instance = Calendar.getInstance();
        //获取当前是本月的几号
        int end = instance.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int j = 1; j <= end; j++){
            instance.set(Calendar.DAY_OF_MONTH,j);
            String format = simpleDateFormat.format(instance.getTime());
            dates.add(format);

            counts.add("0");

        }

        for (DateDto dateDto : dateDtos) {
            int i = Integer.parseInt(dateDto.getDate().substring(8, 10));
            counts.set(i - 1,dateDto.getOrderCount());
        }




        echartsDto.setDate(dates);
        echartsDto.setCount(counts);

        return echartsDto;
    }




}
