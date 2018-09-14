package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author : P2M.zhangyn
 * @version : 2.9.6
 * @copyright : Sysware Technology Co., Ltd
 * @date : 11:48  2018/09/14
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String helloMethod(){
        return  "hello spring-boot";

    }


}
