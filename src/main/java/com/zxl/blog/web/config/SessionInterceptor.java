package com.zxl.blog.web.config;

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

        //访问静态资源直接通过
        if(StringUtils.startsWith(request.getRequestURI(),"/static")) return true;

        Object object = request.getSession().getAttribute("user");

        //访问登录界面或者服务
        if(StringUtils.startsWith(request.getRequestURI(),"/user/login")){
            //自动登录
            if(object != null){
                response.sendRedirect("/user/index");
            }

            return true;
        }

        //访问其他资源需要登录
        if(object != null){
            return true;
        }
        else{
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/user/login").forward(request,response);
            return true;
        }
    }
}
