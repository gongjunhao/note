package com.gjh6.java.review.arithmetic.interview;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-09
 * Time: 11:47 AM
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, ExecutionException, InterruptedException {
        EqualTest equalTest = new EqualTest(1);
        EqualTest equalTest1 = new EqualTest(1);
        System.out.println(equalTest.equals(equalTest1));
        EqualTest clone = (EqualTest) equalTest.clone();
        System.out.println(equalTest.equals(clone));
        MyThread thread = new MyThread();
        thread.start();
        MyRunable myRunable = new MyRunable();
        Thread thread1 = new Thread(myRunable);
        thread1.start();
        MyCallable callable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread2 = new Thread(futureTask);
        thread2.start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(thread);
//        FutureTask<String> futureTask1 = new FutureTask<>(callable);
//        executorService.submit(futureTask1);
//        futureTask1.cancel(true);
//        System.out.println(futureTask1.isCancelled());
//        executorService.execute(() -> {
//            System.out.println("xxxx");
//        });

        SyncDemo syncDemo = new SyncDemo();
        SyncDemo syncDemo1 = new SyncDemo();
        executorService.execute(() -> {syncDemo.test();});
        executorService.execute(() -> {syncDemo1.test();});

        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
        CountDownLatch countDownLatch = new CountDownLatch(2);
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());

        executorService.shutdown();


    }
}
