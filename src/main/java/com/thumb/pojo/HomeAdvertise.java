package com.thumb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeAdvertise {

    private int id;
    private String name;
    private int type;
    private String pic;
    private int status;
    private int click_count;
    private int order_count;
    private String url;
    private String note;
    private int sort;

}
