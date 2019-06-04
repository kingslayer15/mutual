package com.thumb.pojo;

public class Brand {

    private int id;
    private String name;
    private String first_letter;
    private int sort;
    private int factory_status;
    private int show_status;
    private int product_count;
    private int product_comment_count;
    private String logo;
    private String big_pic;
    private String brand_story;

    public Brand() {
    }

    public Brand(int id, String name, String first_letter, int sort,
                 int factory_status, int show_status, int product_count,
                 int product_comment_count, String logo, String big_pic,
                 String brand_story) {
        this.id = id;
        this.name = name;
        this.first_letter = first_letter;
        this.sort = sort;
        this.factory_status = factory_status;
        this.show_status = show_status;
        this.product_count = product_count;
        this.product_comment_count = product_comment_count;
        this.logo = logo;
        this.big_pic = big_pic;
        this.brand_story = brand_story;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", first_letter='" + first_letter + '\'' +
                ", sort=" + sort +
                ", factory_status=" + factory_status +
                ", show_status=" + show_status +
                ", product_count=" + product_count +
                ", product_comment_count=" + product_comment_count +
                ", logo='" + logo + '\'' +
                ", big_pic='" + big_pic + '\'' +
                ", brand_story='" + brand_story + '\'' +
                '}';
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

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(int factory_status) {
        this.factory_status = factory_status;
    }

    public int getShow_status() {
        return show_status;
    }

    public void setShow_status(int show_status) {
        this.show_status = show_status;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public int getProduct_comment_count() {
        return product_comment_count;
    }

    public void setProduct_comment_count(int product_comment_count) {
        this.product_comment_count = product_comment_count;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBig_pic() {
        return big_pic;
    }

    public void setBig_pic(String big_pic) {
        this.big_pic = big_pic;
    }

    public String getBrand_story() {
        return brand_story;
    }

    public void setBrand_story(String brand_story) {
        this.brand_story = brand_story;
    }
}
