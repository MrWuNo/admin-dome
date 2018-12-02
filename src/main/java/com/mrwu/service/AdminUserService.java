package com.mrwu.service;

import com.mrwu.dao.IAdminUserDao;
import com.mrwu.model.AdminUser;
import com.mrwu.service.serviceI.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program SSM
 * @description: 后台用户服务实现类
 * @author: wuzhangyi
 * @create: 2018/12/02 18:37
 */
@Service("adminUserService")
public class AdminUserService implements IAdminUserService {
    @Autowired
    IAdminUserDao adminUserDao;

    @Override
    public AdminUser login(AdminUser adminUser) {
        AdminUser result =  adminUserDao.login(adminUser);
        return result;
    }
}
