package com.thumb.pay.utils;

import com.thumb.mapper.OmsOrderMapper;
import com.thumb.utility.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Thread.sleep;

public class OrderNoUtils {



    @Autowired
    OmsOrderMapper omsOrderMapper;

    public String creatOrderNo(Date lastDate ){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");

        Date date = new Date();

        //当前日期
        String format = simpleDateFormat.format(date);


        long l = System.currentTimeMillis();
        String s = Long.toString(l);

        //当前时间毫秒值得后8位
        String substring = s.substring(5);

//        NumberUtils numberUtils = new NumberUtils();


        //判断是否是新的一天
        if(!simpleDateFormat.format(lastDate).equals(format)){
            //新的一天
            NumberUtils.getAtomicNum().set(0);
        }
        NumberUtils numberUtils = NumberUtils.getNumberUtils();

        //时间信息6位+6位自增流水号+下单时间的毫秒值后八位

        System.out.println(numberUtils.getNewAutoNum());

        String orderNo = format + numberUtils.getNewAutoNum() +substring;

        System.out.println(numberUtils.getNewAutoNum());


        return orderNo;
    }



    }

