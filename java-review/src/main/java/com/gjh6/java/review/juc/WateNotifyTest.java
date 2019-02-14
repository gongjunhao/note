package com.gjh6.java.review.juc;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description: wait(), notify(), notifyAll()
 * 它们都属于 Object 的一部分，而不属于 Thread。
 * 只能用在同步方法或者同步控制块中使用！否则会在运行时抛出 IllegalMonitorStateExeception。
 * 启动2个线程，分别执行同步方法
 * User: gjh
 * Date: 2019-02-14
 * Time: 10:06 AM
 */
public class WateNotifyTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        WaitNotifyDemo demo = new WaitNotifyDemo();
        //demo.a();
        //demo.b();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {
                demo.a();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                demo.a();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            demo.b();
        });
    }

    static class WaitNotifyDemo {
        public synchronized void a() throws InterruptedException {
            wait();
            System.out.println("a");
        }

        public synchronized void b() {
            System.out.println("b");
            notifyAll();
        }
    }
}
