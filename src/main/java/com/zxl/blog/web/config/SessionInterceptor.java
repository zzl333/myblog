package com.zxl.blog.web.config;

import com.zxl.blog.db.entities.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * session拦截器
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object object = request.getSession().getAttribute("user");

        //访问登录界面或者服务
        if(StringUtils.startsWith(request.getRequestURI(),"/user/login")){
            //自动登录
            if(object != null){
                //刷新session时间
                System.out.println(((User) object).toString());
                request.getSession().setMaxInactiveInterval(1800);
                response.sendRedirect("/user/index");
            }

            return true;
        }

        //访问其他资源需要登录
        if(object != null){
            request.getSession().setMaxInactiveInterval(1800);
            return true;
        }
        else{
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/user/login").forward(request,response);
            return true;
        }
    }
}
