package com.xhx.order.service;

import java.math.BigDecimal;

/**
 * ClassName:IOrderPayService
 * Package:com.xhx.order.service
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 16:34
 * @Author:XHX
 */
public interface IOrderPayService {
    String pushOrder(Long userId, BigDecimal money);
}
