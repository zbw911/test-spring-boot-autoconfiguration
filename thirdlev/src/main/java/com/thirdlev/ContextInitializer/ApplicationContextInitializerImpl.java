package com.thirdlev.ContextInitializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author zhangbaowei
 */
@Order(111) // @Order的value值越小->越早执行。注：在类上标注，不是方法上
public class ApplicationContextInitializerImpl implements ApplicationContextInitializer {
    /**
     * applicationContext.getBeanDefinitionCount()
     * getBeanDefinitionCount()方法 是ListableBeanFactory 接口的方法，        ConfigurableApplicationContext 通过继承和实现
     * 拥有了该方法
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        // 打印容器里面有多少个bean
        System.out.println("bean count=====" + applicationContext.getBeanDefinitionCount());

        // 打印人所有 beanName
        System.out.println(applicationContext.getBeanDefinitionCount() + "个Bean的名字如下：");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

    }
}