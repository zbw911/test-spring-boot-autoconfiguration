package com.thirdlev.autoconfiguration;

import com.thirdlev.autoconfigurationConditions.MyConfig;
import com.thirdlev.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 13:37.
 */

@Configuration
public class helloAutoConfig {

    @Autowired
    MyConfig myConfig;

    public helloAutoConfig() {
        System.out.println("hello Configed");
    }


    @Bean("CCCC")
    public config myConfig() {
        return new config();
    }

}
