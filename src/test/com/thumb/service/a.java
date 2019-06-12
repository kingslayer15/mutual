package com.thumb.service;

import com.thumb.pay.utils.NumberUtils;

import static java.lang.Thread.sleep;

public class a {

    public static void main(String[] args) throws InterruptedException {
        NumberUtils numberUtils = NumberUtils.getNumberUtils();

while (true){


    String newAutoNum = numberUtils.getNewAutoNum();
    System.out.println(newAutoNum);
    sleep(50);

}
    }
}
