package com.ww.controller;

/**
 * Created by ww on 2020/3/13.
 */
public class Son extends Proper{
    Son(){
        System.out.println("子类构造方法");
    }
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类代码块");
    }
}
