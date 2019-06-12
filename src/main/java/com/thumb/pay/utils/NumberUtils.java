package com.thumb.pay.utils;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberUtils {


    public static AtomicInteger getAtomicNum() {
        return atomicNum;
    }

    //静态变量存储最大值
    private static final AtomicInteger atomicNum = new AtomicInteger();
    //初始化分组编号
    private final int INIT_GROUP_NUM = 0;

    /**
     * @Author  javaloveiphone
     * @Description :初始化设置分组编号最大值
     * @throws Exception
     * void
     */
    @PostConstruct
    public void initMaxNum(){
        try{
            int maxGroupNum = 100000;
            if(maxGroupNum<INIT_GROUP_NUM){
                maxGroupNum = INIT_GROUP_NUM;
            }

            atomicNum.set(maxGroupNum);
        }catch(Exception e){

        }
    }

    /**
     * @Author  javaloveiphone
     * @Description :获取最新分组编号
     * @return
     * int
     * 注：此方法并没有使用synchronized进行同步，因为共享的编号自增操作是原子操作，线程安全的
     */
    public String getNewAutoNum(){
        //线程安全的原子操作，所以此方法无需同步
        int newNum = atomicNum.incrementAndGet();
        //数字长度为6位，长度不够数字前面补0
        String newStrNum = String.format("%06d", newNum);
        return newStrNum;
    }
}