package com.ww.controller.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * Created by ww on 2020/3/23.
 */
public class CarBeanFactoryPostProcessor1 implements BeanFactoryPostProcessor, Ordered {

    int order;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        System.out.println("=======> 执行CarBeanFactoryPostProcessor1");
//        BeanDefinition bd = beanFactory.getBeanDefinition("car");
//        bd.getPropertyValues().addPropertyValue("name", "bmw");
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }
}

