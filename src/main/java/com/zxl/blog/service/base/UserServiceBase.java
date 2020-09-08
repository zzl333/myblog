package com.zxl.blog.service.base;

import com.zxl.blog.db.entities.User;
import com.zxl.blog.db.mapper.base.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ResourceBundle;

/**
 * 用户服务基类
 */
public class UserServiceBase extends ServiceBase{

    @Autowired
    private UserMapper userMapper;

    protected static final ResourceBundle RES_USER = ResourceBundle.getBundle("strings/user");

    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
