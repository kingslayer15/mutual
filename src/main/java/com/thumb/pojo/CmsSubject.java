package com.thumb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubject {

    private int id;

    //种类id
    private int category_id;

    //标题
    private String title;

    //图片网络地址
    private String pic;

    //关联产品数量
    private int product_count;

    //是否为推荐状态 1:是 2:否
    private int recommend_status;

    //创建时间
    private Date create_time;

    //付款数量
    private int collect_count;

    //浏览人数
    private int read_count;

    //评价数量
    private int comment_count;

    //画册图片用逗号分割
    private String album_pics;

    //专题描述
    private String description;

    //显示状态: 0:不显示 1:显示
    private int show_status;

    //主要内容
    private long content;

    //推送次数
    private int forward_count;

    //所属种类名字
    private String category_name;

    //排序依据
    private int sort;

}
