package com.thirdlev.autoconfigurationConditions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:29.
 */
@Configuration
@ConditionalOnProperty(prefix = "a.b", name = "testproperty", havingValue = "haha")
public class TestConditionalOnProperty {
    public TestConditionalOnProperty() {
        System.out.println(TestConditionalOnProperty.class);
    }
}
