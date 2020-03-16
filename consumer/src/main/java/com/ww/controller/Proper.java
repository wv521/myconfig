package com.ww.controller;

/**
 * Created by ww on 2020/3/13.
 */
public class Proper {

    private static int a = 1;

    Proper(){
        System.out.println("父类：我是构造方法");
    }

    static {
        System.out.println("父类：我是静态代码块");
    }

    {
        System.out.println("父类：我是普通代码块");
    }
}
