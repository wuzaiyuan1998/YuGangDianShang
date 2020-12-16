package com.wuzaiyuan.springbootmapper.controller;

import com.wuzaiyuan.springbootmapper.pojo.UserInfo;
import com.wuzaiyuan.springbootmapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller+@ResponseBody
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getAll")
    public List<UserInfo> getAll(){
        List<UserInfo> allUsers = userInfoService.getAll();
        return allUsers;
    }


    // 条件查询  根据 pojo 属性字段查询   = and查询
    @GetMapping("/getByUserInfo")
    public List<UserInfo> getByUserInfo(UserInfo userInfo){
        return userInfoService.getByUserInfo(userInfo);
    }

    // 模糊查询
    @GetMapping("/getByUserLike")
    public List<UserInfo> getByUserLike(UserInfo userInfo){
        return userInfoService.getByUserLike(userInfo);
    }

//    getCountByUserLike
    // 模糊查询  记录数
    @GetMapping("/getCountByUserLike")
    public Integer getCountByUserLike(UserInfo userInfo){
        return userInfoService.getCountByUserLike(userInfo);
    }

    // 根据主键删除
    @GetMapping("/delByUserId")
    @ResponseBody
    public Integer delByUserId(UserInfo userInfo){
        return userInfoService.delByUserId(userInfo);
    }


    // 插入数据
    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(@RequestBody UserInfo userInfo){
        userInfoService.addUser(userInfo);
        System.out.println("请求到达："+userInfo);
        return "ok";
    }


    // 插入数据
    @PostMapping("/updateUser")
    @ResponseBody
    public String updateUser(@RequestBody UserInfo userInfo){
        userInfoService.updateUser(userInfo);
        System.out.println("请求到达："+userInfo);
        return "ok";
    }





}
