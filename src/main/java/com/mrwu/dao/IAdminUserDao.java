package com.mrwu.dao;

import com.mrwu.model.AdminUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program SSM
 * @description: 后台用户dao
 * @author: wuzhangyi
 * @create: 2018/12/02 17:08
 */
@MapperScan
public interface IAdminUserDao {
    public List<AdminUser> findAll();

    public AdminUser login(AdminUser adminUser);
}
