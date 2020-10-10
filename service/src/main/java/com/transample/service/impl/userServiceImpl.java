package com.transample.service.impl;/*
 * @Author: panc
 * @Date:2020/10/10 16:49*/

import com.transample.core.model.User;
import com.transample.dao.entity.UserEntity;
import com.transample.dao.mapper.UserMapper;
import com.transample.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User query(long id){
        UserEntity userEntity=userMapper.query(id);
        User user=new User();
        BeanUtils.copyProperties(userEntity,user);
        return user;
    }
}
