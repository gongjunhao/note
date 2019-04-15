package com.gjh6.java.review.thread.pcdemo1;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 8:58 AM
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Thread threadP = new Thread(new Producer(phone));
        Thread threadC = new Thread(new Customer(phone));
        threadP.start();
        threadC.start();
    }
}
