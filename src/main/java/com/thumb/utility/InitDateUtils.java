package com.thumb.utility;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
     * @param backDayNum 设置起始日期，-1为前一月，1为后一月
     * @return
     */
    public static ArrayList getInitMonthDates(int backDayNum) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());

        calendar.set(Calendar.DAY_OF_MONTH,0);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);


        Date starTime = calendar.getTime();


        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        Date endTime = calendar.getTime();

        ArrayList<Date> dates = new ArrayList<>();
        dates.add(starTime);
        dates.add(endTime);

        return dates;
    }


     public static ArrayList getInitWeekDates(int backDayNum) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());
         System.out.println(new Date());

        calendar.set(Calendar.DAY_OF_WEEK,0);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);

        Date starTime = calendar.getTime();

         System.out.println("Utils里的starTime:"+starTime);

        calendar.add(Calendar.WEEK_OF_MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        Date endTime = calendar.getTime();

         System.out.println("Utils里的endTime:"+starTime);

        ArrayList<Date> dates = new ArrayList<>();
        dates.add(starTime);
        dates.add(endTime);

        return dates;
    }


}
