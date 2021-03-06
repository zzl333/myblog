package com.zxl.blog.web.api;

import com.zxl.blog.db.entities.User;
import com.zxl.blog.db.mapper.base.UserMapper;
import com.zxl.blog.db.pojo.UserDetail;
import com.zxl.blog.service.UserService;
import com.zxl.blog.web.api.base.UserBaseApi;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserApi extends UserBaseApi {

    @Autowired
    private UserService userService;

    //跳转到登录页面
    @GetMapping("/user/login")
    public String login(){
        return "login";
    }

    //登录功能
    @PostMapping("/user/loginAction")
    public String loginAction(@RequestParam("account") String account,
                              @RequestParam("password") String password,
                              HttpServletRequest request){
        if(account == null || password == null){
            request.setAttribute("msg", RES_USER.getString("user.login.isempty"));
            return "login";
        }
        User user = userService.login(account,password,request);
        if(user == null) return "login";
        //放入Session
        request.getSession().setAttribute("user", user);
        return "redirect:index";
    }

    //跳转到index页面
    @GetMapping("/user/index")
    public String index(HttpServletRequest request){
        //重定向的页面手动封装用户信息
        request.setAttribute("account",
                ((User) request.getSession().getAttribute("user")).getAccount());
        return "index";
    }

    @GetMapping("/user/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:login";
    }

    @GetMapping("/usesr/userDetail")
    public String userDetail(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("user");
        if(user == null || StringUtils.isEmpty(user.getAccount())) {
            request.setAttribute("msg", "请先登录");
            return "login";
        }
        UserDetail userDetail = userService.userDetail(user.getAccount());
        request.setAttribute("userDetail", userDetail);
        return "userDetail";
    }
}
