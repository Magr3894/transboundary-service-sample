package com.transample.dao.mapper;/*
 * @Author: panc
 * @Date:2020/10/10 16:44*/

import com.transample.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Select("Select * from user where id=#{id}")
    public UserEntity query(long id);
}
