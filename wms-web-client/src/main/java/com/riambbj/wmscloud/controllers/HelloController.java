package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.UserService;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUser() throws Exception{
        UserService us=new UserService();
        try{
            return us.getUserList();
        }catch (Exception e){
            return null;
        }

    }
    @RequestMapping("/hello")
    public ModelAndView hello(){
       ModelAndView mv=new ModelAndView();
       mv.setViewName("Hello");
       mv.addObject("name","xx");
       return mv;
    }
}
