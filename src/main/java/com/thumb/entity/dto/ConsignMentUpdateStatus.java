package com.thumb.entity.dto;

import lombok.Data;

/**
 * @author Liming
 * @date 2019/6/14 17:26
 */

@Data
public class ConsignMentUpdateStatus {

    int id,status;

    //物流快递
    private String deliveryComPany;
    //物流单号
    private String deliverySn;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDeliveryComPany() {
        return deliveryComPany;
    }

    public void setDeliveryComPany(String deliveryComPany) {
        this.deliveryComPany = deliveryComPany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }
}
