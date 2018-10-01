package com.niepan.springbootai3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* 附加功能中的折线图
* */
@Controller
public class OtherFunController {

//   来到折线图页面
    @GetMapping("/otherFun")
    public String toOtherFunPage(){
        return "otherFunction/zheXianTu";
    }
}
