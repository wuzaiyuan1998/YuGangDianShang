package com.wuzaiyuan.springbootmapper.service.impl;

import com.wuzaiyuan.springbootmapper.mapper.UserInfoMapper;
import com.wuzaiyuan.springbootmapper.pojo.UserInfo;
import com.wuzaiyuan.springbootmapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getUserById(Integer id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }

    // 根据属性条件查询   等值查询 = and
    @Override
    public List<UserInfo> getByUserInfo(UserInfo userInfo) {
        List<UserInfo> select = userInfoMapper.select(userInfo);
        return select;
    }


    // 模糊查询
    @Override
    public List<UserInfo> getByUserLike(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        // 构建查询条件集合
        Example.Criteria criteria = example.createCriteria();
        // 具体的条件  字段名  字段值
        criteria.andLike("name","%"+userInfo.getName()+"%");
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        return userInfos;
    }

    // 模糊查询 查询记录数
    @Override
    public Integer getCountByUserLike(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        // 构建查询条件集合
        Example.Criteria criteria = example.createCriteria();
        // 具体的条件  字段名  字段值
        criteria.andLike("name","%"+userInfo.getName()+"%");
        int count = userInfoMapper.selectCountByExample(example);
        return count;
    }

    @Override
    public Integer addUser(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    // 根据主键更新用户
    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    // 根据主键删除
    @Override
    public Integer delByUserId(UserInfo userInfo) {
        return userInfoMapper.deleteByPrimaryKey(userInfo);
    }
}
