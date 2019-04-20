package com.gjh6.java.review.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-20
 * Time: 7:49 PM
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        int count = 4;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for(int i=0; i< count; i++) {
            executorService.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕！");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("主线程执行完毕！");
        executorService.shutdown();
    }
}
