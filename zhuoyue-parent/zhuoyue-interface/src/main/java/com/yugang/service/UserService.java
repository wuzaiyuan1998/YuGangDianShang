package com.yugang.service;

import com.yugang.pojo.UserInfo;

// 用户接口
public interface UserService {

    // 根据用户id查询用户数据
    public UserInfo getUerById(UserInfo userInfo);
}
