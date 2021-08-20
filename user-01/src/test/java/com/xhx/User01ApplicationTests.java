package com.xhx;

import com.xhx.user.dao.IUserInfoDao;
import com.xhx.user.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class User01ApplicationTests {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Test
    void contextLoads() {
        UserInfo entity = new UserInfo();
        entity.setBalance(new BigDecimal("100"));
        entity.setUserName("张三");
        userInfoDao.insert(entity);
    }

}
