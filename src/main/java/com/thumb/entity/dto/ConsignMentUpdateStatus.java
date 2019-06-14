package com.thumb.entity.dto;

import lombok.Data;

/**
 * @author Liming
 * @date 2019/6/14 17:26
 */

@Data
public class ConsignMentUpdateStatus extends UpdateStatus {

    //物流快递
    private String deliveryCompany;
    //物流单号
    private String deliverySn;

    @Override
    public String toString() {
        return "ConsignMentUpdateStatus{" +
                "deliveryCompany='" + deliveryCompany + '\'' +
                ", deliverySn='" + deliverySn + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
