package com.thumb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeProduct {

    private int id;
    private int product_id;
    private String product_name;
    private int recommend_status;
    private int sort;

}
