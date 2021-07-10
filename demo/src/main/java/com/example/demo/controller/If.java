package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class If {


    @RequestMapping(value = "/if")
    @ResponseBody
    public int iff(){
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (i ==1 ){
                System.out.println("我是1");
            }else if (i==2){
                continue;
            }else if(i==3){
                System.out.println("我是三儿");
            }
            else {
                res+=i;
            }
        }
        return res;
    }
}
