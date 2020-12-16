package com.wuzaiyuan.springbootmapper.pojo;

import lombok.Data;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 添加数据完成后生成的主键赋值给对于字段
    private Integer id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
