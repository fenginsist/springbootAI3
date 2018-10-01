package com.niepan.springbootai3;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.niepan.springbootai3.bean.LoginUser;
import com.niepan.springbootai3.bean.Medicine;
import com.niepan.springbootai3.mapper.LoginUserMapper;
import com.niepan.springbootai3.mapper.MedicineMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAi3ApplicationTests {

	@Autowired
	MedicineMapper medicineMapper;

	@Autowired
	LoginUserMapper loginUserMapper;

	/*
	 * user
	 * 查询出密码进行比较
	 * */
	@Test
	public void loginUserBlloean(){
		System.out.println(loginUserMapper);
		LoginUser user = loginUserMapper.getUserByName("chenxiuyang");
		System.out.println(user);
	}

	/*
	* 插入user
	* */
	@Test
	public void insertUser(){
		System.out.println("loginUserMapper");
		int a = loginUserMapper.insertUser(new LoginUser("fengfanli","123456"));
		if (a!=0){
			System.out.println(a);

			System.out.println("插入成功");
		}
	}


	/*
	* 查询药品
	* */
	@Test
	public void contextLoads() {
		System.out.println(medicineMapper+"=======================");
		Medicine medicById = medicineMapper.getMedicineById(1);
		System.out.println(medicById.toString()+"-----------------------------");
		System.out.println("aaaaaaaaaaa");
	}



}
