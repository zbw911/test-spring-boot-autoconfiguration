package com.thirdlev.ContextInitializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * ApplicationContextInitializer的实现类
 * ApplicationContextInitializer接口是在spring容器刷新之前执行的一个回调函数。
 */
@Order(1) // @Order的value值越小->越早执行，注：在类上标注，不是方法上
public class ApplicationContextInitializerImpl2 implements ApplicationContextInitializer {
    /**
     * applicationContext.getBeanDefinitionCount()
     * getBeanDefinitionCount()方法 是ListableBeanFactory 接口的方法，ConfigurableApplicationContext 通过继承和实现
     * 拥有了该方法
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("applicationContext.getApplicationName(),默认为空(看源码):" + applicationContext.getApplicationName());
        System.out.println("applicationContext.getDisplayName(),即context的name:" + applicationContext.getDisplayName());
    }
}