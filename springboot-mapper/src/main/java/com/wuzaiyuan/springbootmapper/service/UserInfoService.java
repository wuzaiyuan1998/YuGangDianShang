package com.wuzaiyuan.springbootmapper.service;

import com.wuzaiyuan.springbootmapper.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {

    public List<UserInfo> getAll();

    public UserInfo getUserById(Integer id);

    List<UserInfo> getByUserInfo(UserInfo userInfo);

    List<UserInfo> getByUserLike(UserInfo userInfo);

    Integer getCountByUserLike(UserInfo userInfo);

    Integer addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    Integer delByUserId(UserInfo userInfo);
}
