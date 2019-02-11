package com.gjh6.java.review.arithmetic.interview;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-10
 * Time: 11:09 AM
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable running");
    }
}
