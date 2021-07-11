package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @ResponseBody
    @RequestMapping(value = "/test")
    public String test(){
        return "测试";
    }
}
