package com.zxl.blog.web.api.base;

import com.zxl.blog.service.base.UserServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ResourceBundle;

/**
 * 用户基类API
 */
public class UserBaseApi extends ControllerApi{

    @Autowired
    protected UserServiceBase userServiceBase;

    protected static final ResourceBundle RES_USER = ResourceBundle.getBundle("strings/user");


    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public Object selectByPrimaryKey(@RequestParam("uid") Integer uid){
        return userServiceBase.selectByPrimaryKey(uid);
    }

}
