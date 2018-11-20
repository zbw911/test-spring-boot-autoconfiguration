package com.thirdlev.autoconfigurationConditions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:17.
 */

@Configuration
@ConditionalOnBean(MyConfig.class)
public class TestConditionalOnBeanProtypes {

    @Autowired
    MyConfig myConfig;

    public TestConditionalOnBeanProtypes() {
        System.out.println(TestConditionalOnBeanProtypes.class);
        System.out.println(myConfig.toString());
    }
}
