package com.hehe.hello;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 12:27.
 */
@Component
public class Alaaaa {
    public String say() {
        return new Date().toString();
    }
}
