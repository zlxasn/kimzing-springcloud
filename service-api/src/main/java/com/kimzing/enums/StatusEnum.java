package com.kimzing.enums;

/**
 * 启用禁用状态.
 *
 * @author KimZing - kimzing@163.com
 * @since 2020/7/3 17:55
 */
public enum StatusEnum {

    ENABLE("启用"),
    DISABLE("禁用");

    private String name;

    StatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
