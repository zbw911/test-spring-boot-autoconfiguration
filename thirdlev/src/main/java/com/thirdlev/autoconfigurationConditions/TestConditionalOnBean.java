package com.thirdlev.autoconfigurationConditions;

import com.thirdlev.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:17.
 */

@Configuration
@ConditionalOnBean(config.class)
public class TestConditionalOnBean {

    public TestConditionalOnBean() {
        System.out.println(TestConditionalOnBean.class);
    }
}
