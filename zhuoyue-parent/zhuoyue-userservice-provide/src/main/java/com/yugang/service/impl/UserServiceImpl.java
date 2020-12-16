package com.yugang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yugang.mapper.UserMapper;
import com.yugang.pojo.UserInfo;
import com.yugang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

// 放入注册中心
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUerById(UserInfo userInfo) {
        return userMapper.selectByPrimaryKey(userInfo);
    }
}
