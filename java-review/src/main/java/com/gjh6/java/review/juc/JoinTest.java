package com.gjh6.java.review.juc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * a,b 2个线程，
 * b 线程先启动，但是因为在 b 线程中调用了 a 线程的 join() 方法，
 * b 线程会等待 a 线程结束才继续执行，
 * 因此最后能够保证 a 线程的输出先于 b 线程的输出
 * @author : gjh
 * Date: 2019-02-14
 * Time: 9:56 AM
 */
public class JoinTest {

    public static void main(String[] args) {
        Thread a = new Thread(()->{
            try {
                System.out.println("a is running");
                System.out.println("a sleep 1s");
                Thread.sleep(1000);
                System.out.println("a is completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread b = new Thread(()->{
            try {
                System.out.println("b is running");
                a.join();
                System.out.println("b is completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        b.start();
        a.start();
    }

}
