package com.thumb.pay.vo;



public class AliPayInfoVo {
    //付款金额，必填
    String total_amount;
    //订单名称，必填
    String subject;
    //商品描述，可空
    String body;

    @Override
    public String toString() {
        return "AliPayInfoVo{" +
                "total_amount='" + total_amount + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public AliPayInfoVo(String total_amount, String subject, String body) {
        this.total_amount = total_amount;
        this.subject = subject;
        this.body = body;
    }

    public AliPayInfoVo() {
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
