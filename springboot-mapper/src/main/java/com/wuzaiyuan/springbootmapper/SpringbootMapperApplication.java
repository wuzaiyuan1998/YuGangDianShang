package com.wuzaiyuan.springbootmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wuzaiyuan.springbootmapper.mapper")
public class SpringbootMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMapperApplication.class, args);
    }



}
