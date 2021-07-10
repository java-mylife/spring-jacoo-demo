package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hi {

    public Hi() {

    }


    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(){
        return "Say,Hi" ;
    }
}
