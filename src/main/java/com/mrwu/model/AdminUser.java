package com.mrwu.model;

import com.mrwu.model.base.BaseEntry;

/**
 * @program SSM
 * @description: 后台用户实体类
 * @author: wuzhangyi
 * @create: 2018/12/02 15:46
 */
public class AdminUser extends BaseEntry {
    private Integer id;         // 主键ID
    private String name;        // 用户名（登陆用）
    private String password;    // 密码MD5加密
    private Long phone;         // 手机号码
    private String nickname;    // 昵称
    private String describe;    // 个人描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
