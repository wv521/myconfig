package com.ww.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by 安利丹 on 2020/2/26.
 */
public class TestController {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext ctx =
//                new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println(ctx.getId());
////        TestBean tb = ctx.getBean(TestBean.class);
////        tb.test();\


        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        lock.unlock();



    }


}
