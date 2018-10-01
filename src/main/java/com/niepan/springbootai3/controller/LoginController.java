package com.niepan.springbootai3.controller;

import com.niepan.springbootai3.bean.LoginUser;
import com.niepan.springbootai3.services.LoginUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    LoginUserServices  loginUserServices;

    /*用户登录*/
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session){
        /*if(!StringUtils.isEmpty(username)&&"123456".equals(password)){*/
        String userPassword =  loginUserServices.loginUserBlloean(username);
        if(password.equals(userPassword)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            map.put("mag","用户名密码错误");
            return "login";
        }
    }

    /*插入新用户*/
    @PostMapping("/user/add")
    @ResponseBody
    public void addUser(LoginUser loginUser){
        System.out.println("ajax传到controller");
        int i = loginUserServices.insertUser(loginUser);
        if (i!=0){
            System.out.println("插入成功");
        }
    }



}
