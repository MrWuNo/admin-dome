package com.mrwu.controller.AdminUser;

import com.mrwu.model.AdminUser;
import com.mrwu.service.serviceI.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program SSM
 * @description: 后台用户控制器
 * @author: wuzhangyi
 * @create: 2018/12/02 17:12
 */
@Controller
@RequestMapping(value = "/adminUser")
public class AdminUserController {
    @Autowired
    IAdminUserService adminUserService;

    @RequestMapping(value = "/gotoLogin")
    public String gotoLogin() {
        System.out.println("gotoLogin");
        return "adminUser/login";
    }

    @RequestMapping(value = "/registered")
    public String registered(AdminUser adminUser) {
        return "adminUser/login";
    }

    @RequestMapping(value = "/login")
    public String login(AdminUser adminUser, HttpServletRequest request) {
        AdminUser result = adminUserService.login(adminUser);
        if (result != null) {
            System.out.println("登陆成功");
            return "redirect:/index";
        } else {
            System.out.println("登陆失败");
            return "adminUser/login";
        }
    }
}
