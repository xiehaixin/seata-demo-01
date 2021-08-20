package com.xhx.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName:OrderPay
 * Package:com.xhx.order.entity
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 15:43
 * @Author:XHX
 */
@Data
@TableName("order_pay")
public class OrderPay {

    @TableId(type = IdType.AUTO, value = "order_id")
    private Long orderId;
    private String orderNo;
    private BigDecimal payMoeny;

}
