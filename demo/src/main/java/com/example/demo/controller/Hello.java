package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hellodemo(){
        return "Hello,我成功了";
    }
}
