package com.ww.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
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


//        ReentrantLock lock = new ReentrantLock(true);
//        lock.lock();
//        lock.unlock();

//        Condition condition = lock.newCondition();
//        lock.lock();
//        try {
//            condition.await();
//            System.out.println("234");
//            condition.signal();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        finally {
//            lock.unlock();
//        }}

//        System.out.println(Math.round(-1.5));
        DayOfWeek dayOfWeek = LocalDate.of(2020, 03,13).getDayOfWeek();
        System.out.println(dayOfWeek);

    }

}
