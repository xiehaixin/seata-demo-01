package com.xhx.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhx.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:IUserInfoDao
 * Package:com.xhx.user.dao
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 15:57
 * @Author:XHX
 */
@Mapper
public interface IUserInfoDao extends BaseMapper<UserInfo> {
}
