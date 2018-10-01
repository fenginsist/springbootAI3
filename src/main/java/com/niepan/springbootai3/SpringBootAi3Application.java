package com.niepan.springbootai3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.niepan.springbootai3.mapper")
public class SpringBootAi3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAi3Application.class, args);
	}
}
