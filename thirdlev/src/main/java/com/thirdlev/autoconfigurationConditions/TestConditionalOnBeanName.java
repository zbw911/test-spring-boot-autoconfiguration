package com.thirdlev.autoconfigurationConditions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:26.
 */
@Configuration
@ConditionalOnBean(name = "CCCC")
public class TestConditionalOnBeanName {
    public TestConditionalOnBeanName() {
        System.out.println(TestConditionalOnBeanName.class);
    }
}