package com.kimzing.order.domain.order;

/**
 * 订单状态.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/7/4 14:32
 */
public enum OrderStatusEnum {
    CREATED("已创建"),
    PAYED("已支付"),
    SENDED("已发货"),
    RECEIVED("已收货"),
    FINISHED("已完成"),
    CANCEL("已取消");


    private String name;

    OrderStatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
