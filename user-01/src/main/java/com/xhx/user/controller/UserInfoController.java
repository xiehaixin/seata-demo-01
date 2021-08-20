package com.xhx.user.controller;

import com.xhx.user.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * ClassName:UserInfoController
 * Package:com.xhx.user.controller
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 15:55
 * @Author:XHX
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;


    @PutMapping("/setBalance")
    public String setBalance(Long userId, BigDecimal money){
        return userInfoService.setBalance(userId, money);
    }

}
