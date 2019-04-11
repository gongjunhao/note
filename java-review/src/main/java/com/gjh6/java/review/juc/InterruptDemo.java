package com.gjh6.java.review.juc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 线程状态：
 *  1. NEW   初始状态 线程被构建 没有调用start()
 *  2. RUNNING  运行状态 java线程将操作系统中的就绪和运行2中状态 笼统的称作"运行中"
 *  3. BLOCKED  阻塞状态 表示线程阻塞于锁
 *  4. WAITING  等待状态 表示当前处于等待状态，需要其他线程做一些操作如 notify 或 interrupt等
 *  5. TIME_WAITING   等待状态或超时等待状态
 *  6. TERMINATED     终止状态 标识当前线程已经运行完毕
 *
 * User: gjh
 * Date: 2019-04-11
 * Time: 6:23 PM
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        //sleepThread睡眠1000ms
        final Thread sleepThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        //busyThread一直执行死循环
        Thread busyThread = new Thread() {
            @Override
            public void run() {
                while (true){}
            }
        };
        sleepThread.start();
        busyThread.start();
        sleepThread.interrupt();
        busyThread.interrupt();
        while (sleepThread.isInterrupted()){}
        System.out.println("sleepThread isInterrupted: " + sleepThread.isInterrupted());
        System.out.println("busyThread isInterrupted: " + busyThread.isInterrupted());
    }
}
