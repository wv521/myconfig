package com.ww.controller.proxy;

/**
 *  真实对象类
 * Created by ww on 2020/3/25.
 */
public class RealSubject implements Subject{
    @Override
    public void rent() {
        System.out.println("=======");
    }

    @Override
    public void hello(String str) {
        System.out.println(str);
    }
}
