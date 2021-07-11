package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class diff_01 {

    @RequestMapping(value = "/diff01")
    @ResponseBody
    public String diff(){
        return "diff：提测分支有，master分支没有 = 此处为增量";
    }
}
