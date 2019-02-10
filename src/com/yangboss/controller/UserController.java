package com.yangboss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class UserController {


    public String login(){
       return "login/index";
    }
    @RequestMapping(value="/index")
    public ModelAndView modelAndView(ModelAndView mv){
        mv.addObject("username","yangboss");
        return mv;
    }

}
