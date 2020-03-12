package com.ww.controller.suo.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ww on 2020/3/12.
 */
public class QueueTest implements Runnable{

    private CountDownLatch countDownLatch;

    QueueTest(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {

        System.out.println("开始排队，进入队列等待");
        try {
            Thread.sleep(5000);
            System.out.println("排队结束，开始缴费");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(countDownLatch != null)
                countDownLatch.countDown();
        }
    }
}
