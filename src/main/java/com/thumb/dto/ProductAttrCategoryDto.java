package com.thumb.dto;

public class ProductAttrCategoryDto {
    private int id;
    private String name;
    private int attribute_count;
    private int param_count;

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

    public int getAttribute_count() {
        return attribute_count;
    }

    public void setAttribute_count(int attribute_count) {
        this.attribute_count = attribute_count;
    }

    public int getParam_count() {
        return param_count;
    }

    public void setParam_count(int param_count) {
        this.param_count = param_count;
    }

    @Override
    public String toString() {
        return "ProductAttrCategoryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attribute_count=" + attribute_count +
                ", param_count=" + param_count +
                '}';
    }
}
