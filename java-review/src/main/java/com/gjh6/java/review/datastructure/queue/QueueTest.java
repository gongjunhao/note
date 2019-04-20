package com.gjh6.java.review.datastructure.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description: 队列操作方法
 *  offer 新增一个至队尾，满了返回false
 *  add  新增一个至队尾，满了抛出异常
 *  take 从队首取出一个数据，如果取完则等待队列填充
 *  poll 从队首取出一个数据，如果取完则返回null
 * User: gjh
 * Date: 2018-12-05
 * Time: 4:05 PM
 */
public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

        for (int i=0; i< 10; i++) {
            queue.add(i + "");
        }

        System.out.println(queue.size());
        System.out.println(queue.toString());
        System.out.println(queue.offer("1"));
        //add 满了抛异常
        //offer 满了返回false
        for (int i =0; i< 12; i++) {
            System.out.println("第"+i+"次");
            System.out.println(queue.poll());
            System.out.println(queue.toString());
        }
        //System.out.println(queue.poll());
        //System.out.println(queue.toString());
        //System.out.println(queue.add("1"));
        System.exit(0);
    }
}
