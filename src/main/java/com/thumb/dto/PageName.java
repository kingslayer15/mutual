package com.thumb.dto;


import java.util.Arrays;

public class PageName extends Page{

    private int id;
    private String name;
    private int show;
    private int[] checkID;

    public PageName() {

    }

    public PageName(int id, String name, int show, int[] checkID) {
        this.id = id;
        this.name = name;
        this.show = show;
        this.checkID = checkID;
    }

    public PageName(int pageNow, int pageSize, int id, String name, int show, int[] checkID) {
        super(pageNow, pageSize);
        this.id = id;
        this.name = name;
        this.show = show;
        this.checkID = checkID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShow() {
        return show;
    }

    public void setShow(int show) {
        this.show = show;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", show=" + show +
                ", checkID=" + Arrays.toString(checkID) +
                '}';
    }
}
