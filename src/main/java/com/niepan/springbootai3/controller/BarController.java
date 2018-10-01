package com.niepan.springbootai3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BarController {

    @GetMapping("/functionEinleitung")
    public String toFunctionEinleitungPage(){
        return "medicine/functionEinleitung";
    }




}