package com.thumb.entity.pojo;

import lombok.ToString;

/**
 * 订单的设置类，此表有五项内容
 */

@ToString
public class OmsOrderSetting {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.flash_order_overtime
     *
     * @mbggenerated
     */
    private Integer flashOrderOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.normal_order_overtime
     *
     * @mbggenerated
     */
    private Integer normalOrderOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.confirm_overtime
     *
     * @mbggenerated
     */
    private Integer confirmOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.finish_overtime
     *
     * @mbggenerated
     */
    private Integer finishOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.comment_overtime
     *
     * @mbggenerated
     */
    private Integer commentOvertime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.id
     *
     * @return the value of oms_order_setting.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.id
     *
     * @param id the value for oms_order_setting.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.flash_order_overtime
     *
     * @return the value of oms_order_setting.flash_order_overtime
     *
     * @mbggenerated
     */
    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.flash_order_overtime
     *
     * @param flashOrderOvertime the value for oms_order_setting.flash_order_overtime
     *
     * @mbggenerated
     */
    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.normal_order_overtime
     *
     * @return the value of oms_order_setting.normal_order_overtime
     *
     * @mbggenerated
     */
    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.normal_order_overtime
     *
     * @param normalOrderOvertime the value for oms_order_setting.normal_order_overtime
     *
     * @mbggenerated
     */
    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.confirm_overtime
     *
     * @return the value of oms_order_setting.confirm_overtime
     *
     * @mbggenerated
     */
    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.confirm_overtime
     *
     * @param confirmOvertime the value for oms_order_setting.confirm_overtime
     *
     * @mbggenerated
     */
    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.finish_overtime
     *
     * @return the value of oms_order_setting.finish_overtime
     *
     * @mbggenerated
     */
    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.finish_overtime
     *
     * @param finishOvertime the value for oms_order_setting.finish_overtime
     *
     * @mbggenerated
     */
    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.comment_overtime
     *
     * @return the value of oms_order_setting.comment_overtime
     *
     * @mbggenerated
     */
    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.comment_overtime
     *
     * @param commentOvertime the value for oms_order_setting.comment_overtime
     *
     * @mbggenerated
     */
    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }
}