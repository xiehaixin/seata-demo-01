package com.xhx.user.service;

import com.xhx.user.dao.IUserInfoDao;
import com.xhx.user.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * ClassName:UserInfoServiceImpl
 * Package:com.xhx.user.service
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 16:54
 * @Author:XHX
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService{

    @Autowired
    private IUserInfoDao userInfoDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String setBalance(Long userId, BigDecimal money) {
        UserInfo userInfo = userInfoDao.selectById(userId);
        if(userInfo != null){
            userInfo.setBalance(userInfo.getBalance().subtract(money));
            int i = userInfoDao.updateById(userInfo);
            if(i > 0){
                return "SUCCESS";
            }
        }
        return "FAIL";
    }
}
