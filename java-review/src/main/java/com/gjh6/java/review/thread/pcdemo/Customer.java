package com.gjh6.java.review.thread.pcdemo;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 8:57 AM
 */
public class Customer implements Runnable {

    private ArrayList<Phone> stock;

    public Customer(ArrayList<Phone> stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stock) {
                if(stock.isEmpty()) {
                    try {
                        stock.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    stock.remove(0);
                    System.out.println("消费一个，库存数量："+ stock.size());
                }
            }
        }
    }
}
