package com.gmail.lizaiatsenko;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liza on 14/03/2017.
 */
public class MyInterseptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(request.getRequestURI().contains("checkUser")){

            Student student = (Student) modelAndView.getModel().get("user");
            if(student.getName()=="" || student.getHobby()==""){
                response.sendRedirect("/failed");
            }
        }
    }
}
