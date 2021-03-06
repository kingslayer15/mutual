package com.thumb.entity.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class OmsOrder {

    /**
     * 订单id
     */
    private Long id;

    /**
     * 客户id
     */
    private Long memberId;

    /**
     *
     */
    private Long couponId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.create_time
     *
     * @mbggenerated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.member_username
     *
     * @mbggenerated
     */
    private String memberUsername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.total_amount
     *
     * @mbggenerated
     */
    private BigDecimal totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.pay_amount
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.freight_amount
     *
     * @mbggenerated
     */
    private BigDecimal freightAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.promotion_amount
     *
     * @mbggenerated
     */
    private BigDecimal promotionAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.integration_amount
     *
     * @mbggenerated
     */
    private BigDecimal integrationAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.coupon_amount
     *
     * @mbggenerated
     */
    private BigDecimal couponAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.discount_amount
     *
     * @mbggenerated
     */
    private BigDecimal discountAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.pay_type
     *
     * @mbggenerated
     */
    private Integer payType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.source_type
     *
     * @mbggenerated
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款，1->待发货，2->已发货，3-已完成，4->已关闭，5->无效订单
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.order_type
     *
     * @mbggenerated
     */
    private Integer orderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delivery_company
     *
     * @mbggenerated
     */
    private String deliveryCompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delivery_sn
     *
     * @mbggenerated
     */
    private String deliverySn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.auto_confirm_day
     *
     * @mbggenerated
     */
    private Integer autoConfirmDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.integration
     *
     * @mbggenerated
     */
    private Integer integration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.growth
     *
     * @mbggenerated
     */
    private Integer growth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.promotion_info
     *
     * @mbggenerated
     */
    private String promotionInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.bill_type
     *
     * @mbggenerated
     */
    private Integer billType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.bill_header
     *
     * @mbggenerated
     */
    private String billHeader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.bill_content
     *
     * @mbggenerated
     */
    private String billContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.bill_receiver_phone
     *
     * @mbggenerated
     */
    private String billReceiverPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.bill_receiver_email
     *
     * @mbggenerated
     */
    private String billReceiverEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_name
     *
     * @mbggenerated
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_phone
     *
     * @mbggenerated
     */
    private String receiverPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_post_code
     *
     * @mbggenerated
     */
    private String receiverPostCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_province
     *
     * @mbggenerated
     */
    private String receiverProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_city
     *
     * @mbggenerated
     */
    private String receiverCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_region
     *
     * @mbggenerated
     */
    private String receiverRegion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receiver_detail_address
     *
     * @mbggenerated
     */
    private String receiverDetailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.note
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.confirm_status
     *
     * @mbggenerated
     */
    private Integer confirmStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delete_status
     *
     * @mbggenerated
     */
    private Integer deleteStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.use_integration
     *
     * @mbggenerated
     */
    private Integer useIntegration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.payment_time
     *
     * @mbggenerated
     */
    private Date paymentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.delivery_time
     *
     * @mbggenerated
     */
    private Date deliveryTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.receive_time
     *
     * @mbggenerated
     */
    private Date receiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.comment_time
     *
     * @mbggenerated
     */
    private Date commentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;


    private List<OmsOrderItem> omsOrderItemList;    //该订单下的所有商品的集合











































    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.id
     *
     * @return the value of oms_order.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.id
     *
     * @param id the value for oms_order.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.member_id
     *
     * @return the value of oms_order.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.member_id
     *
     * @param memberId the value for oms_order.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.coupon_id
     *
     * @return the value of oms_order.coupon_id
     *
     * @mbggenerated
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.coupon_id
     *
     * @param couponId the value for oms_order.coupon_id
     *
     * @mbggenerated
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.order_sn
     *
     * @return the value of oms_order.order_sn
     *
     * @mbggenerated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.order_sn
     *
     * @param orderSn the value for oms_order.order_sn
     *
     * @mbggenerated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.create_time
     *
     * @return the value of oms_order.create_time
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.create_time
     *
     * @param createTime the value for oms_order.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.member_username
     *
     * @return the value of oms_order.member_username
     *
     * @mbggenerated
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.member_username
     *
     * @param memberUsername the value for oms_order.member_username
     *
     * @mbggenerated
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.total_amount
     *
     * @return the value of oms_order.total_amount
     *
     * @mbggenerated
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.total_amount
     *
     * @param totalAmount the value for oms_order.total_amount
     *
     * @mbggenerated
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.pay_amount
     *
     * @return the value of oms_order.pay_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.pay_amount
     *
     * @param payAmount the value for oms_order.pay_amount
     *
     * @mbggenerated
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.freight_amount
     *
     * @return the value of oms_order.freight_amount
     *
     * @mbggenerated
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.freight_amount
     *
     * @param freightAmount the value for oms_order.freight_amount
     *
     * @mbggenerated
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.promotion_amount
     *
     * @return the value of oms_order.promotion_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.promotion_amount
     *
     * @param promotionAmount the value for oms_order.promotion_amount
     *
     * @mbggenerated
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.integration_amount
     *
     * @return the value of oms_order.integration_amount
     *
     * @mbggenerated
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.integration_amount
     *
     * @param integrationAmount the value for oms_order.integration_amount
     *
     * @mbggenerated
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.coupon_amount
     *
     * @return the value of oms_order.coupon_amount
     *
     * @mbggenerated
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.coupon_amount
     *
     * @param couponAmount the value for oms_order.coupon_amount
     *
     * @mbggenerated
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.discount_amount
     *
     * @return the value of oms_order.discount_amount
     *
     * @mbggenerated
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.discount_amount
     *
     * @param discountAmount the value for oms_order.discount_amount
     *
     * @mbggenerated
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.pay_type
     *
     * @return the value of oms_order.pay_type
     *
     * @mbggenerated
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.pay_type
     *
     * @param payType the value for oms_order.pay_type
     *
     * @mbggenerated
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.source_type
     *
     * @return the value of oms_order.source_type
     *
     * @mbggenerated
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.source_type
     *
     * @param sourceType the value for oms_order.source_type
     *
     * @mbggenerated
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.status
     *
     * @return the value of oms_order.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.status
     *
     * @param status the value for oms_order.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.order_type
     *
     * @return the value of oms_order.order_type
     *
     * @mbggenerated
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.order_type
     *
     * @param orderType the value for oms_order.order_type
     *
     * @mbggenerated
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delivery_company
     *
     * @return the value of oms_order.delivery_company
     *
     * @mbggenerated
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delivery_company
     *
     * @param deliveryCompany the value for oms_order.delivery_company
     *
     * @mbggenerated
     */
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delivery_sn
     *
     * @return the value of oms_order.delivery_sn
     *
     * @mbggenerated
     */
    public String getDeliverySn() {
        return deliverySn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delivery_sn
     *
     * @param deliverySn the value for oms_order.delivery_sn
     *
     * @mbggenerated
     */
    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.auto_confirm_day
     *
     * @return the value of oms_order.auto_confirm_day
     *
     * @mbggenerated
     */
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.auto_confirm_day
     *
     * @param autoConfirmDay the value for oms_order.auto_confirm_day
     *
     * @mbggenerated
     */
    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.integration
     *
     * @return the value of oms_order.integration
     *
     * @mbggenerated
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.integration
     *
     * @param integration the value for oms_order.integration
     *
     * @mbggenerated
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.growth
     *
     * @return the value of oms_order.growth
     *
     * @mbggenerated
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.growth
     *
     * @param growth the value for oms_order.growth
     *
     * @mbggenerated
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.promotion_info
     *
     * @return the value of oms_order.promotion_info
     *
     * @mbggenerated
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.promotion_info
     *
     * @param promotionInfo the value for oms_order.promotion_info
     *
     * @mbggenerated
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.bill_type
     *
     * @return the value of oms_order.bill_type
     *
     * @mbggenerated
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.bill_type
     *
     * @param billType the value for oms_order.bill_type
     *
     * @mbggenerated
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.bill_header
     *
     * @return the value of oms_order.bill_header
     *
     * @mbggenerated
     */
    public String getBillHeader() {
        return billHeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.bill_header
     *
     * @param billHeader the value for oms_order.bill_header
     *
     * @mbggenerated
     */
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader == null ? null : billHeader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.bill_content
     *
     * @return the value of oms_order.bill_content
     *
     * @mbggenerated
     */
    public String getBillContent() {
        return billContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.bill_content
     *
     * @param billContent the value for oms_order.bill_content
     *
     * @mbggenerated
     */
    public void setBillContent(String billContent) {
        this.billContent = billContent == null ? null : billContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.bill_receiver_phone
     *
     * @return the value of oms_order.bill_receiver_phone
     *
     * @mbggenerated
     */
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.bill_receiver_phone
     *
     * @param billReceiverPhone the value for oms_order.bill_receiver_phone
     *
     * @mbggenerated
     */
    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone == null ? null : billReceiverPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.bill_receiver_email
     *
     * @return the value of oms_order.bill_receiver_email
     *
     * @mbggenerated
     */
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.bill_receiver_email
     *
     * @param billReceiverEmail the value for oms_order.bill_receiver_email
     *
     * @mbggenerated
     */
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail == null ? null : billReceiverEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_name
     *
     * @return the value of oms_order.receiver_name
     *
     * @mbggenerated
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_name
     *
     * @param receiverName the value for oms_order.receiver_name
     *
     * @mbggenerated
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_phone
     *
     * @return the value of oms_order.receiver_phone
     *
     * @mbggenerated
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_phone
     *
     * @param receiverPhone the value for oms_order.receiver_phone
     *
     * @mbggenerated
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_post_code
     *
     * @return the value of oms_order.receiver_post_code
     *
     * @mbggenerated
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_post_code
     *
     * @param receiverPostCode the value for oms_order.receiver_post_code
     *
     * @mbggenerated
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode == null ? null : receiverPostCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_province
     *
     * @return the value of oms_order.receiver_province
     *
     * @mbggenerated
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_province
     *
     * @param receiverProvince the value for oms_order.receiver_province
     *
     * @mbggenerated
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_city
     *
     * @return the value of oms_order.receiver_city
     *
     * @mbggenerated
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_city
     *
     * @param receiverCity the value for oms_order.receiver_city
     *
     * @mbggenerated
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_region
     *
     * @return the value of oms_order.receiver_region
     *
     * @mbggenerated
     */
    public String getReceiverRegion() {
        return receiverRegion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_region
     *
     * @param receiverRegion the value for oms_order.receiver_region
     *
     * @mbggenerated
     */
    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion == null ? null : receiverRegion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receiver_detail_address
     *
     * @return the value of oms_order.receiver_detail_address
     *
     * @mbggenerated
     */
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receiver_detail_address
     *
     * @param receiverDetailAddress the value for oms_order.receiver_detail_address
     *
     * @mbggenerated
     */
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress == null ? null : receiverDetailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.note
     *
     * @return the value of oms_order.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.note
     *
     * @param note the value for oms_order.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.confirm_status
     *
     * @return the value of oms_order.confirm_status
     *
     * @mbggenerated
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.confirm_status
     *
     * @param confirmStatus the value for oms_order.confirm_status
     *
     * @mbggenerated
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delete_status
     *
     * @return the value of oms_order.delete_status
     *
     * @mbggenerated
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delete_status
     *
     * @param deleteStatus the value for oms_order.delete_status
     *
     * @mbggenerated
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.use_integration
     *
     * @return the value of oms_order.use_integration
     *
     * @mbggenerated
     */
    public Integer getUseIntegration() {
        return useIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.use_integration
     *
     * @param useIntegration the value for oms_order.use_integration
     *
     * @mbggenerated
     */
    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.payment_time
     *
     * @return the value of oms_order.payment_time
     *
     * @mbggenerated
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.payment_time
     *
     * @param paymentTime the value for oms_order.payment_time
     *
     * @mbggenerated
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.delivery_time
     *
     * @return the value of oms_order.delivery_time
     *
     * @mbggenerated
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.delivery_time
     *
     * @param deliveryTime the value for oms_order.delivery_time
     *
     * @mbggenerated
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.receive_time
     *
     * @return the value of oms_order.receive_time
     *
     * @mbggenerated
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.receive_time
     *
     * @param receiveTime the value for oms_order.receive_time
     *
     * @mbggenerated
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.comment_time
     *
     * @return the value of oms_order.comment_time
     *
     * @mbggenerated
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.comment_time
     *
     * @param commentTime the value for oms_order.comment_time
     *
     * @mbggenerated
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.modify_time
     *
     * @return the value of oms_order.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.modify_time
     *
     * @param modifyTime the value for oms_order.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }



}