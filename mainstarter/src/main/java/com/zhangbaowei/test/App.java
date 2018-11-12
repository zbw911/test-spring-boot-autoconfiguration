package com.zhangbaowei.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 9:06.
 */
@SpringBootApplication
@ComponentScan(value = {"com.zhangbaowei.test", "secondlev", "com.thirdlev.tttt"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
