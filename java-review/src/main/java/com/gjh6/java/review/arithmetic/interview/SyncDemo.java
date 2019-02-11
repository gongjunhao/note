package com.gjh6.java.review.arithmetic.interview;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-10
 * Time: 12:10 PM
 */
public class SyncDemo {

    public synchronized void test() {
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
    }
}
