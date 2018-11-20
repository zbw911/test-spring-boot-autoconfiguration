package com.thirdlev.autoconfigurationConditions;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 14:36.
 */
@Component
@ConfigurationProperties(prefix = "my.config")
public class MyConfig {
    int a;
    String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }
}
