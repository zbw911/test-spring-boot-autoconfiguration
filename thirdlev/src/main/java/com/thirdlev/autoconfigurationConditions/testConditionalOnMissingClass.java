package com.thirdlev.autoconfigurationConditions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:10.
 */
@Configuration
@ConditionalOnMissingClass("com.zhangbaowei.hello.AA")

//@ConditionalOnMissingClass("com.thirdlev.config")
public class testConditionalOnMissingClass {

    public testConditionalOnMissingClass() {
        System.out.println("testA.inited");
    }
}
