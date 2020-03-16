package com.ww.controller.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 完成自动装配
 * Created by ww on 2020/3/16.
 */
public class AwareBean implements ApplicationContextAware,BeanNameAware{

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName :" + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean("awareBean"));
    }
}
