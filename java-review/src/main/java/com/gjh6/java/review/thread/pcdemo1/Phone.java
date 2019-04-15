package com.gjh6.java.review.thread.pcdemo1;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 9:00 AM
 */
public class Phone {
    private ArrayList<String> stock = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void produce() {
        try {
            while (true) {
                lock.lock();
                stock.add("phone");
                System.out.println("生产phone，当前库存"+stock.size());
                if(stock.size() > 10) {
                    condition.signalAll();
                    condition.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void coustomer() {
        try {
            while (true) {
                lock.lock();
                stock.remove(0);
                System.out.println("消费phone，当前库存"+stock.size());
                if(stock.isEmpty()) {
                    condition.signalAll();
                    condition.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
