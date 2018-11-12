package com.hehe.hello;

import com.thirdlev.autoconfiguration.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 12:26.
 */
@SpringBootApplication
public class hi {

    public static void main(String[] args) {
        SpringApplication.run(hi.class, args);

        Alaaaa bean = SpringContextHolder.getBean(Alaaaa.class);
        System.out.println(bean.say());
    }
}
