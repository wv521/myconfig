package com.ww.controller.suo.countDownLatch;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ww on 2020/3/12.
 */
public class CountDownLatchTest {

    public static void main(String[] args) {

        long now = System.currentTimeMillis();

        CountDownLatch countDownLatch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newFixedThreadPool(3);  // 定长线程池

        executorService.execute(new SeeDoctorTest(countDownLatch));
        executorService.execute(new QueueTest(countDownLatch));

        try {
            countDownLatch.await();  // 等待其他线程各自完成后，再执行。
            System.out.println("搞定回家！总共耗时："+ (System.currentTimeMillis()-now));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }


    }

}
