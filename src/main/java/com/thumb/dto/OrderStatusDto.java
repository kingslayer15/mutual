package com.thumb.dto;


/**
 * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
 */
public class OrderStatusDto{
    //订单状态
    private Integer status;
    //数量
    private Integer num;

    @Override
    public String toString() {
        return "OrderStatusDto{" +
                "status=" + status +
                ", num=" + num +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public OrderStatusDto(int status, int num) {
        this.status = status;
        this.num = num;
    }

    public OrderStatusDto() {
    }
}
