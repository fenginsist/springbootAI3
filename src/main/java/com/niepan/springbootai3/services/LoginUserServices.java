package com.niepan.springbootai3.services;

import com.niepan.springbootai3.bean.LoginUser;
import com.niepan.springbootai3.bean.Medicine;
import com.niepan.springbootai3.mapper.LoginUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServices {

    @Autowired
    LoginUserMapper loginUserMapper;

    /*
    * 查询出密码进行比较
    * */
    public String loginUserBlloean(String username){
        LoginUser user = loginUserMapper.getUserByName(username);
        String userPassword = user.getU_password();
        return  userPassword;
    }

    /*新建用户
    * 插入用户
    * */
    public int insertUser(LoginUser loginUser){
        int i = loginUserMapper.insertUser(loginUser);
        return i;
    }



}
