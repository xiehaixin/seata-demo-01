package com.xhx.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName:UserInfo
 * Package:com.xhx.user.entity
 * Description:请为该功能做描述
 *
 * @Date:2021/8/20 15:55
 * @Author:XHX
 */
@Data
@TableName("user_info")
public class UserInfo {

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private String userName;

    private BigDecimal balance;
}
