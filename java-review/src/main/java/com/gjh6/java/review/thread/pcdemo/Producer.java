package com.gjh6.java.review.thread.pcdemo;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 8:57 AM
 */
public class Producer implements Runnable {

    private ArrayList<Phone> stock;

    public Producer(ArrayList<Phone> stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        synchronized (stock) {
            while (true) {
                if(stock.size() > 10) {
                    try {
                        System.out.println("库存已满");
                        stock.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stock.add(new Phone());
                System.out.println("库存数量"+stock.size());
            }
        }
    }
}
