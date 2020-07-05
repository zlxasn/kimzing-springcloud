package com.kimzing.order.domain.order;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kimzing.utils.po.AbstractPO;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 订单信息实体
 *
 * @author KimZing
 * @since 2020-07-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("order")
public class OrderPO extends AbstractPO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;

    /**
     * 订单总价
     */
    @TableField("total_price")
    private Integer totalPrice;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

}