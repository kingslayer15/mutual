package com.thumb.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProduct {
    List<PmsProduct> pmsSkuStockList;

    private PmsProductCategory pmsProductCategory;



    private int product_id;
    private String product_name;
    private int recommend_status;



    private Long id;

    private Long brandId;
    private Long brand_id;


    private Long productCategoryId;
    private Long product_category_id;

    private Long feightTemplateId;
    private Long feight_template_id;

    private Long productAttributeCategoryId;
    private Long product_attribute_category_id;

    private String name;

    private String pic;

    /**
     * 货号
     */
    private String productSn;
    private String product_sn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    private Integer newStatus;
    private Integer new_status;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommandStatus;
    private Integer recommand_status;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    private Integer verifyStatus;
    private Integer verify_status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 销量
     */
    private Integer sale;

    private BigDecimal price;

    /**
     * 促销价格
     */
    private BigDecimal promotionPrice;
    private BigDecimal promotion_price;

    /**
     * 赠送的成长值
     */
    private Integer giftGrowth;
    private Integer gift_growth;

    /**
     * 赠送的积分
     */
    private Integer giftPoint;
    private Integer gift_point;

    /**
     * 限制使用的积分数
     */
    private Integer usePointLimit;
    private Integer use_point_limit;

    /**
     * 副标题
     */
    private String subTitle;
    private String sub_title;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 市场价
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 库存预警值
     */
    private Integer lowStock;
    private Integer low_stock;

    /**
     * 单位
     */
    private String unit;

    /**
     * 商品重量，默认为克
     */
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    private String serviceIds;

    private String keywords;

    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    private String albumPics;
    private String album_pics;


    private String detailTitle;
    private String detail_title;



    private String detailDesc;
    private String detail_desc;

    /**
     * 产品详情网页内容
     */
    private String detailHtml;
    private String detail_html;

    /**
     * 移动端网页详情
     */
    private String detailMobileHtml;
    private String detail_mobile_html;

    /**
     * 促销开始时间
     */
    private Date promotionStartTime;
    private Date promotion_start_time;

    /**
     * 促销结束时间
     */
    private Date promotionEndTime;
    private Date promotion_end_time;

    /**
     * 活动限购数量
     */
    private Integer promotionPerLimit;
    private Integer promotion_per_limit;


    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    private Integer promotionType;
    private Integer promotion_type;

    /**
     * 品牌名称
     */
    private String brandName;
    private String  brand_name;

    /**
     * 商品分类名称
     */
    private String productCategoryName;
    private String product_category_name;
}