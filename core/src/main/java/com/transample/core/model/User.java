package com.transample.core.model;


import lombok.Data;

/**
 * <p>用户业务模型</p>
 */
@Data
public class User {
    /**
     * 对象ID -- 唯一标识
     */
    private Long id;

    /**
     * 对象名称
     */
    private String name;
    /**
     * 用户联系方式
     */
    private String telPhone;
}
