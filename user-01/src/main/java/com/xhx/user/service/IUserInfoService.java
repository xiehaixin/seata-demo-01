package com.xhx.user.service;

import java.math.BigDecimal;

/**
 * ClassName:IUserInfoService
 * Package:com.xhx.user.service
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 16:53
 * @Author:XHX
 */
public interface IUserInfoService {
    String setBalance(Long userId, BigDecimal money);
}
