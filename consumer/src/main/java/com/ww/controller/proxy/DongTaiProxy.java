package com.ww.controller.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  动态代理类
 * Created by ww on 2020/3/25.
 */
public class DongTaiProxy implements InvocationHandler{

    // 要代理的真实对象
    private Object object;

    DongTaiProxy(Object object){
        this.object =  object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前的操作");
//        method.invoke(object,args);
        System.out.println("代理后的操作");
        return null;
    }
}


