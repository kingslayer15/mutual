package com.thumb.pay.vo;


import java.math.BigDecimal;
import java.util.Date;

public class AliPayInfoVo {

    //商户订单号，商户网站订单系统中唯一订单号
    String order_sn;
    //付款金额，必填
    String pay_amount;
    //订单名称，必填
    String subject;
    //商品描述，可空
    String body;

    /**
     * 订单id
     */
    private Long id;

    private Long memberId;

    private Long couponId;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 提交时间
     */
    private Date createTime;

    /**
     * 用户帐号
     */
    private String memberUsername;


    /**
     * 运费金额
     */
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    private String deliveryCompany;

    /**
     * 物流单号
     */
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    private Integer integration;

    /**
     * 可以活动的成长值
     */
    private Integer growth;

    /**
     * 活动信息
     */
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    private Integer billType;

    /**
     * 发票抬头
     */
    private String billHeader;

    /**
     * 发票内容
     */
    private String billContent;

    /**
     * 收票人电话
     */
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    private String receiverProvince;

    /**
     * 城市
     */
    private String receiverCity;

    /**
     * 区
     */
    private String receiverRegion;

    /**
     * 详细地址
     */
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    private Integer useIntegration;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    private Date receiveTime;

    /**
     * 评价时间
     */
    private Date commentTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    @Override
    public String toString() {
        return "AliPayInfoVo{" +
                "order_sn='" + order_sn + '\'' +
                ", pay_amount='" + pay_amount + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", id=" + id +
                ", memberId=" + memberId +
                ", createTime=" + createTime +
                ", memberUsername='" + memberUsername + '\'' +
                ", freightAmount=" + freightAmount +
                ", promotionAmount=" + promotionAmount +
                ", integrationAmount=" + integrationAmount +
                ", couponAmount=" + couponAmount +
                ", discountAmount=" + discountAmount +
                ", payType=" + payType +
                ", sourceType=" + sourceType +
                ", status=" + status +
                ", orderType=" + orderType +
                ", deliveryCompany='" + deliveryCompany + '\'' +
                ", deliverySn='" + deliverySn + '\'' +
                ", autoConfirmDay=" + autoConfirmDay +
                ", integration=" + integration +
                ", growth=" + growth +
                ", promotionInfo='" + promotionInfo + '\'' +
                ", billType=" + billType +
                ", billHeader='" + billHeader + '\'' +
                ", billContent='" + billContent + '\'' +
                ", billReceiverPhone='" + billReceiverPhone + '\'' +
                ", billReceiverEmail='" + billReceiverEmail + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverPostCode='" + receiverPostCode + '\'' +
                ", receiverProvince='" + receiverProvince + '\'' +
                ", receiverCity='" + receiverCity + '\'' +
                ", receiverRegion='" + receiverRegion + '\'' +
                ", receiverDetailAddress='" + receiverDetailAddress + '\'' +
                ", note='" + note + '\'' +
                ", confirmStatus=" + confirmStatus +
                ", deleteStatus=" + deleteStatus +
                ", useIntegration=" + useIntegration +
                ", paymentTime=" + paymentTime +
                ", deliveryTime=" + deliveryTime +
                ", receiveTime=" + receiveTime +
                ", commentTime=" + commentTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(String pay_amount) {
        this.pay_amount = pay_amount;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public AliPayInfoVo(String order_sn, String pay_amount, String subject, String body, Long id, Long memberId, Date createTime, String memberUsername, BigDecimal freightAmount, BigDecimal promotionAmount, BigDecimal integrationAmount, BigDecimal couponAmount, BigDecimal discountAmount, Integer payType, Integer sourceType, Integer status, Integer orderType, String deliveryCompany, String deliverySn, Integer autoConfirmDay, Integer integration, Integer growth, String promotionInfo, Integer billType, String billHeader, String billContent, String billReceiverPhone, String billReceiverEmail, String receiverName, String receiverPhone, String receiverPostCode, String receiverProvince, String receiverCity, String receiverRegion, String receiverDetailAddress, String note, Integer confirmStatus, Integer deleteStatus, Integer useIntegration, Date paymentTime, Date deliveryTime, Date receiveTime, Date commentTime, Date modifyTime) {
        this.order_sn = order_sn;
        this.pay_amount = pay_amount;
        this.subject = subject;
        this.body = body;
        this.id = id;
        this.memberId = memberId;
        this.createTime = createTime;
        this.memberUsername = memberUsername;
        this.freightAmount = freightAmount;
        this.promotionAmount = promotionAmount;
        this.integrationAmount = integrationAmount;
        this.couponAmount = couponAmount;
        this.discountAmount = discountAmount;
        this.payType = payType;
        this.sourceType = sourceType;
        this.status = status;
        this.orderType = orderType;
        this.deliveryCompany = deliveryCompany;
        this.deliverySn = deliverySn;
        this.autoConfirmDay = autoConfirmDay;
        this.integration = integration;
        this.growth = growth;
        this.promotionInfo = promotionInfo;
        this.billType = billType;
        this.billHeader = billHeader;
        this.billContent = billContent;
        this.billReceiverPhone = billReceiverPhone;
        this.billReceiverEmail = billReceiverEmail;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverPostCode = receiverPostCode;
        this.receiverProvince = receiverProvince;
        this.receiverCity = receiverCity;
        this.receiverRegion = receiverRegion;
        this.receiverDetailAddress = receiverDetailAddress;
        this.note = note;
        this.confirmStatus = confirmStatus;
        this.deleteStatus = deleteStatus;
        this.useIntegration = useIntegration;
        this.paymentTime = paymentTime;
        this.deliveryTime = deliveryTime;
        this.receiveTime = receiveTime;
        this.commentTime = commentTime;
        this.modifyTime = modifyTime;
    }

    public AliPayInfoVo() {
    }
}
