package com.gjh6.java.review.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description: 同步
 * User: gjh
 * Date: 2019-04-18
 * Time: 4:38 PM
 */
public class TestPlus {

    static int count = 0;       //或者替换为 AtomicInteger，或者 加synchronized

    static CountDownLatch cdl = new CountDownLatch(1000);

    /**
     * 微信公众号：Java面经
     */
    public static void main(String[] args) throws Exception {
        CountRunnable countRunnable = new CountRunnable();
        for (int i = 0; i < 1000; i++) {
            new Thread(countRunnable).start();
        }
        cdl.await();
        System.out.println(count);
    }

    static class CountRunnable implements Runnable {
        ReentrantLock lock = new ReentrantLock();

        private void count() {
            for (int i = 0; i < 1000; i++) {
                lock.lock();
                try {
                    ++count;
                } finally {
                    lock.unlock();
                }
            }
        }

        @Override
        public void run() {
            count();
            cdl.countDown();
        }

    }

}
