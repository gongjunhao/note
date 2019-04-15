package com.gjh6.java.review.thread.pcdemo;

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
        ArrayList<Phone> stock = new ArrayList<>();
        Thread threadP = new Thread(new Producer(stock));
        Thread threadC = new Thread(new Customer(stock));
        threadP.start();
        threadC.start();
    }
}
