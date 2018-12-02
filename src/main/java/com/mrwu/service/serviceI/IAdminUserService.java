package com.mrwu.service.serviceI;

import com.mrwu.model.AdminUser;
import org.springframework.stereotype.Service;

/**
 * @program SSM
 * @description: 后台用户服务接口
 * @author: wuzhangyi
 * @create: 2018/12/02 18:41
 */
@Service
public interface IAdminUserService {
    AdminUser login(AdminUser adminUser);
}
