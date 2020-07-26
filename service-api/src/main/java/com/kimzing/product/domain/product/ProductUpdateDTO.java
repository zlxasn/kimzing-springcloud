package com.kimzing.product.domain.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 产品信息更新
 *
 * @author KimZing
 * @since 2020-07-23
 */
@Data
@Accessors(chain = true)
@ApiModel(value="产品信息更新", description="产品信息")
public class ProductUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品信息ID")
    private Integer id;

    @ApiModelProperty(value = "产品标题")
    private String title;

    @ApiModelProperty(value = "产品副标题")
    private String subTitle;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "产品主图")
    private String image;

    @ApiModelProperty(value = "专辑图片，以逗号分割")
    private String albumImages;

    @ApiModelProperty(value = "销量")
    private Integer sales;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "库存预警值")
    private Integer lowStock;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "PC端网页详情")
    private String detailPc;

    @ApiModelProperty(value = "移动端网页详情")
    private String detailMobile;

    @ApiModelProperty(value = "上架状态：UNPUBLISHED->下架；PUBLISHED->上架")
    private String publishStatus;

}
