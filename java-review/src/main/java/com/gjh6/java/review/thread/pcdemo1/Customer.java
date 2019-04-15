package com.gjh6.java.review.thread.pcdemo1;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 8:57 AM
 */
public class Customer implements Runnable {
    private Phone phone;

    public Customer(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void run() {
        phone.coustomer();
    }
}
