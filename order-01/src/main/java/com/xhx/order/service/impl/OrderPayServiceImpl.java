package com.xhx.order.service.impl;

import com.xhx.order.service.IOrderPayService;
import com.xhx.order.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * ClassName:OrderPayServiceImpl
 * Package:com.xhx.order.service.impl
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 16:34
 * @Author:XHX
 */
@Service
public class OrderPayServiceImpl implements IOrderPayService {

    @Resource
    private IUserInfoService userInfoService;

    @Override
    public String pushOrder(Long userId, BigDecimal money) {
        return userInfoService.setBalance(userId, money);
    }
}
