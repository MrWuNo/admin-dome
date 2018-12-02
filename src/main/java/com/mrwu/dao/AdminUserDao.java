package com.mrwu.dao;

import com.mrwu.model.AdminUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program SSM
 * @description: 后台用户dao
 * @author: wuzhangyi
 * @create: 2018/12/02 17:08
 */
@Mapper
public interface AdminUserDao {
    AdminUser findAll();
}
