package com.gjh6.java.review.thread.synchronization;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description: 线程同步
 * User: gjh
 * Date: 2019-04-12
 * Time: 8:13 AM
 */
public class WaitNotify {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //bank.add(1);
                    //bank.syncAdd(1);
                    //bank.syncBlockAdd(1);
                    bank.lockAdd(1);
                }
                countDownLatch.countDown();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //bank.add(1);
                    //bank.syncAdd(1);
                    //bank.syncBlockAdd(1);
                    bank.lockAdd(1);
                }
                countDownLatch.countDown();
            }
        });
        thread.start();
        thread1.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bank.getCount());
    }

}

class Bank {
    //int count;
    volatile int count;

    ReentrantLock lock = new ReentrantLock();

    public void add(int money) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count += money;
    }

    public synchronized void syncAdd(int money) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count += money;
    }

    public void syncBlockAdd(int money) {
        synchronized(this) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count += money;
        }
    }

    public void lockAdd(int money) {
        lock.lock();
        try {
            Thread.sleep(10);
            count += money;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}