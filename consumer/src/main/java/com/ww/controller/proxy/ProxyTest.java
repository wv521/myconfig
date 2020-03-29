package com.ww.controller.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by ww on 2020/3/25.
 */
public class ProxyTest {

    public static void main(String[] args) {
        RealSubject sub = new RealSubject();
        InvocationHandler inv = new DongTaiProxy(sub);

        // 动态获取代理对象
        // newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        //
        // interfaces 要代理的接口/接口的实现类
        // InvocationHandler 关联的一个InvocationHandler接口
        Subject subject = (Subject) Proxy.newProxyInstance(inv.getClass().getClassLoader(), sub.getClass().getInterfaces(), inv);
        subject.hello("hello");
    }
}
