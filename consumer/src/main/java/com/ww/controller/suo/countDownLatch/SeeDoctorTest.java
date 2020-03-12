package com.ww.controller.suo.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ww on 2020/3/12.
 */
public class SeeDoctorTest implements Runnable{

    private CountDownLatch countDownLatch;

    SeeDoctorTest(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("开始看大夫，大夫开始诊断");
        try {
            Thread.sleep(5000);
            System.out.println("看大夫结束，大夫开药方");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(countDownLatch != null)
                countDownLatch.countDown();
        }

    }
}
