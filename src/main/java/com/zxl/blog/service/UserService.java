package com.zxl.blog.service;

import com.zxl.blog.db.entities.User;
import com.zxl.blog.db.entities.UserInfo;
import com.zxl.blog.db.mapper.UserInfoMapperEx;
import com.zxl.blog.db.mapper.UserMapperEx;
import com.zxl.blog.db.mapper.base.UserInfoMapper;
import com.zxl.blog.db.pojo.UserDetail;
import com.zxl.blog.service.base.UserServiceBase;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserService extends UserServiceBase {

    @Autowired
    private UserMapperEx userMapper;
    @Autowired
    private UserInfoMapperEx userInfoMapper;

    public UserDetail userDetail(String account) {
        return userMapper.selectUserDetail(account);
    }

    public User login(String account, String password, HttpServletRequest request){
        User userTem = userMapper.selectByAccount(account);
        //不存在
        if(userTem == null || !StringUtils.equals(password, userTem.getPassword())) {
            request.setAttribute("msg", RES_USER.getString("user.login.err"));
            return null;
        }
        if(!userTem.getActived()){
            request.setAttribute("msg", RES_USER.getString("user.login.no.action"));
            return null;
        }
        return userTem;
    }
}
