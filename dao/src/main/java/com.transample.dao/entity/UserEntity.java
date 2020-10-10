package com.transample.dao.entity;


import lombok.Data;
import com.transample.core.model.User;

/**
 * <p>用户数据实体类</p>
 */
@Data
public class UserEntity {

    private Long id;
    private String name;
    private String telPhone;

    private UserEntity(){

    }

    private UserEntity(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.telPhone = user.getTelPhone();
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + name + '\'' +
                ", telPhone='" + telPhone + '\'' +
                '}';
    }

}