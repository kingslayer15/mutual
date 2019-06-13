package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;


@Getter
@Setter
@ToString
public class ProductDto {
    //商品编号
    private int id;
    //商品图片
    private String pic;
    //商品名称
    private String name;
    //品牌名称
    private String brand_name;
    //价格
    private BigDecimal price;
    //货号
    private String product_sn;
    //标签 上架
    private int publish_status;
    //标签 新品
    private int new_status;
    //标签 推荐
        private int recommand_stauts;
    //排序
    private int sort;
    //SKU库存
    private int stock;
    //销量
    private int sale;
    //审核状态
    private int verify_status;
    //商品分类名称
    private String product_category_name;


    private int brand_id;
    private int product_category_id;
    private int feight_template_id;
    private int product_attribute_category_id;
    //删除状态
    private int delete_status;
    //推荐状态
    private int  recommand_status;
    //促销价格
    private BigDecimal promotion_price;
    //赠送的成长值
    private int gift_growth;
    //赠送的积分
    private int gift_point;
    //限制使用的积分数
    private int use_point_limit;
    //副标题
    private String sub_title;
    //商品描述
    private String description;
    //市场价
    private BigDecimal original_price;
    //库存预警值
    private int low_stock;
    //单位
    private String unit;
    //商品重量
    private BigDecimal weight;
    //是否为预告商品
    private int preview_status;
    //产品服务：1->无忧退货；2->快速退款；3->免费包邮
    private String service_ids;
    private String keywords;
    private String note;
    //画册图片
    private String album_pics;
    private String detail_title;
    private String detail_desc;
    //产品详情网页内容
    private String detail_html;
    //移动端网页详情
    private String detail_mobile_html;
    //促销开始时间
    private String promotion_start_time;
    //促销结束时间
    private String promotion_end_time;
    //活动限购数量
    private int promotion_per_limit;
    //促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；
    // 3->使用阶梯价格；4->使用满减价格；5->限时购
    private int promotion_type;

    //当前页数
    private int pageNo;

    //最大显示页数
    private int maxShowPage;



}
