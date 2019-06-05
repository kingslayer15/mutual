package com.thumb.dto;


import java.util.Arrays;

public class PageName extends Page{

    private String name;
    private int[] checkID;

    public PageName() {

    }

    public PageName(String name, int[] checkID) {
        this.name = name;
        this.checkID = checkID;
    }

    public PageName(int pageNow, int pageSize, String name, int[] checkID) {
        super(pageNow, pageSize);
        this.name = name;
        this.checkID = checkID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getCheckID() {
        return checkID;
    }

    public void setCheckID(int[] checkID) {
        this.checkID = checkID;
    }

    @Override
    public String toString() {
        return "PageName{" +
                "name='" + name + '\'' +
                ", checkID=" + Arrays.toString(checkID) +
                '}';
    }
}
