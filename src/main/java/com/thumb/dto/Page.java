package com.thumb.dto;

public class Page {

    private int pageNow;
    private int pageSize;

    public Page() {
    }

    public Page(int pageNow, int pageSize) {
        this.pageNow = pageNow;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNow=" + pageNow +
                ", pageSize=" + pageSize +
                '}';
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
