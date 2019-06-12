package com.thumb.dto;

import java.util.List;

public class ProductCategoryDto {


    private int id;
    //上机分类的编号：0表示一级分类
    private int parent_id;
    private String name;
    //分类级别：0->1级；1->2级
    private int level;
    private int product_count;
    private String product_unit;
    //是否显示在导航栏：0->不显示；1->显示
    private int nav_status;
    //显示状态：0->不显示；1->显示
    private int show_status;
    private int sort;
    //图标
    private String icon;
    private String keywords;
    private String description;

    private List<ProductCategoryDto> chiren;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public String getProduct_unit() {
        return product_unit;
    }

    public void setProduct_unit(String product_unit) {
        this.product_unit = product_unit;
    }

    public int getNav_status() {
        return nav_status;
    }

    public void setNav_status(int nav_status) {
        this.nav_status = nav_status;
    }

    public int getShow_status() {
        return show_status;
    }

    public void setShow_status(int show_status) {
        this.show_status = show_status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriiption) {
        this.description = descriiption;
    }

    public List<ProductCategoryDto> getChiren() {
        return chiren;
    }

    public void setChiren(List<ProductCategoryDto> chiren) {
        this.chiren = chiren;
    }

    @Override
    public String toString() {
        return "ProductCategoryDto{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", product_count=" + product_count +
                ", product_unit='" + product_unit + '\'' +
                ", nav_status=" + nav_status +
                ", show_status=" + show_status +
                ", sort=" + sort +
                ", icon='" + icon + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", chiren=" + chiren +
                '}';
    }
}
