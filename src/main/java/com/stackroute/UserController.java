package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@Controller
public class UserController{
    @RequestMapping("/display")
    public ModelAndView display(HttpServletRequest request, HttpServletResponse response)
    {
        String string=request.getParameter("p1");
        User user=new User();
        user.setUserName(string);
        String name=user.getUserName();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("msg",name);
        return modelAndView;
    }
}