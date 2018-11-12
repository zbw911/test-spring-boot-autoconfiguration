package com.zhangbaowei.test.controllers;

import com.thirdlev.autoconfiguration.SpringContextHolder;
import com.thirdlev.listener.EmailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secondlev.MyService;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 9:34.
 */
@RestController
@RequestMapping("/")
public class AController {


    @Autowired
    MyService service;


    @GetMapping("/a/h")
    public String hello() {
        return service.niHao();
    }


    @GetMapping("/a/event")
    public String eventMessage() {
        ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();

        EmailEvent event = new EmailEvent("hello", "boylmx@163.com", "this is a email text!");
        applicationContext.publishEvent(event);

        return "hehe";
    }


    @GetMapping("/a/error")
    public String testError() {

        throw new RuntimeException("test");

//        return "hehe";
    }
}
