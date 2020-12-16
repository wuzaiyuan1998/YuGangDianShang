package com.yugang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yugang.pojo.UserInfo;
import com.yugang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControlloer {

    // 从注册中心获取
    @Reference
    private UserService userService;

    @GetMapping("/getUserById")
    @ResponseBody
    public UserInfo getUserById(UserInfo userInfo){
        System.out.println("请求已达到");
        System.out.println(userInfo);
        return userService.getUerById(userInfo);
    }
}
