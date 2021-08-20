package com.xhx.order.controller;

import com.xhx.order.service.IOrderPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * ClassName:OrderController
 * Package:com.xhx.order.controller
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 15:35
 * @Author:XHX
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderPayService orderPayService;

    @GetMapping("/pushOrder")
    public String pushOrder(@RequestParam Long userId, @RequestParam BigDecimal money){
        return orderPayService.pushOrder(userId, money);
    }
}
