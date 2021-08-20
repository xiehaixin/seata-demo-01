package com.xhx.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * ClassName:IUserInfoService
 * Package:com.xhx.order.service
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 16:40
 * @Author:XHX
 */
@FeignClient("USER-INFO-01")
public interface IUserInfoService {

    @PutMapping("/user/setBalance")
    String setBalance(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
