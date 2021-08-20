package com.xhx;

import com.xhx.order.dao.IOrderPayDao;
import com.xhx.order.entity.OrderPay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class Order01ApplicationTests {

    @Autowired
    private IOrderPayDao orderPayDao;

    @Test
    void contextLoads() {
        OrderPay entity = new OrderPay();
        entity.setOrderNo("asfdjklasfxc");
        entity.setPayMoeny(new BigDecimal("10.00"));
        orderPayDao.insert(entity);
    }

}
