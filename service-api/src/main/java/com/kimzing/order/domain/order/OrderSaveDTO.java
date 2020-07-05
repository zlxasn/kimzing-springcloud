package com.kimzing.order.domain.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单信息保存
 *
 * @author KimZing
 * @since 2020-07-06
 */
@Data
@Accessors(chain = true)
@ApiModel(value="订单信息保存", description="订单信息")
public class OrderSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "订单总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "状态")
    private OrderStatusEnum status;

}
