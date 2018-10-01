package com.niepan.springbootai3.mapper;

import com.niepan.springbootai3.bean.LoginUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface LoginUserMapper {

//      @Select("select u_password from loginUser  where u_username=#{username}")
    public LoginUser getUserByName(String username);

//    @Insert("insert into loginUser(u_username,u_password) values(#{username},#{password})")
    public int insertUser(LoginUser loginUser);

}

