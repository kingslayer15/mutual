package com.thumb.dto;

public class ProductBrandDto {
    /*idbigint(20) NOT NULL
    namevarchar(64) NULL
    first_lettervarchar(8) NULL首字母
    sortint(11) NULL
    factory_statusint(1) NULL是否为品牌制造商：0->不是；1->是
    show_statusint(1) NULL
    product_countint(11) NULL产品数量
    product_comment_countint(11) NULL产品评论数量
    logovarchar(255) NULL品牌logo
    big_picvarchar(255) NULL专区大图
    brand_storytext NULL品牌故事*/
    private int id;
    private String name;
    //首字母
    private String first_letter;
    private int sort;
    //是否为品牌制造商：0->不是；1->是
    private int factory_status;
    private int show_status;
    //产品数量
    private int product_count;
    //产品评论数量
    private int product_comment_count;
    private String logo;
    //专区大图
    private String big_pic;
    //品牌故事
    private String brand_story;

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


    @Override
    public String toString() {
        return "ProductBrandDto{" +
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
}
