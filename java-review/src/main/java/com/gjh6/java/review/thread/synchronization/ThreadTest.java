package com.gjh6.java.review.thread.synchronization;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-18
 * Time: 5:33 PM
 */
public class ThreadTest {
    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();
        Thread threada = new Thread(() -> {
            innerTest.a();
        });

        Thread threadb = new Thread(() -> {
            innerTest.b();
        });

        threada.start();
        threadb.start();
    }
}
 class  InnerTest {
    synchronized void a(){
        System.out.println("a");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void b(){
        System.out.println("b");
    }
}