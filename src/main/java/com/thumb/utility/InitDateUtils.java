package com.thumb.utility;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class InitDateUtils {
    /**
     *
     * @param backDayNum 设置起始日期，-1为前一天，+1为后一天
     * @param addDayNum 起始时间往后多少天
     * @return
     */
    public static ArrayList getInitDayDates(int backDayNum, int addDayNum) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());


        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);

        calendar.add(Calendar.DAY_OF_MONTH,backDayNum);

        Date starTime = calendar.getTime();


        calendar.add(Calendar.DAY_OF_MONTH,addDayNum);

        Date endTime = calendar.getTime();

        ArrayList<Date> dates = new ArrayList<>();
        dates.add(starTime);
        dates.add(endTime);

        return dates;
    }


    /**
     *
     * @param monthNum 设置起始日期，-1为前一月，1为后一月，0为本月
     * @return
     */
    public static ArrayList getInitMonthDates(int monthNum) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());


        calendar.set(Calendar.MONTH,monthNum);
        calendar.set(Calendar.DAY_OF_MONTH,0);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);


        Date starTime = calendar.getTime();


        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.MILLISECOND,-1);

        Date endTime = calendar.getTime();

        ArrayList<Date> dates = new ArrayList<>();

        dates.add(starTime);
        dates.add(endTime);

        return dates;
    }


     public static ArrayList getInitWeekDates(int backDayNum) {



        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());


        calendar.set(Calendar.DAY_OF_WEEK,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);

        Date starTime = calendar.getTime();


        calendar.add(Calendar.DAY_OF_MONTH,7);
        calendar.add(Calendar.MILLISECOND,-1);

        Date endTime = calendar.getTime();



        ArrayList<Date> dates = new ArrayList<>();
        dates.add(starTime);
        dates.add(endTime);

        return dates;
    }


}
