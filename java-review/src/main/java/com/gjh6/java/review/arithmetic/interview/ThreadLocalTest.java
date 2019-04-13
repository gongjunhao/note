package com.gjh6.java.review.arithmetic.interview;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-13
 * Time: 7:18 PM
 */
public class ThreadLocalTest {
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void setThreadLocal(String str) {
        threadLocal.set(str);
    }
    public static String getThreadLocal() {
        return threadLocal.get();
    }

    public static void removeThreadLocal() {
        threadLocal.remove();
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int temp=0; temp <10; temp++) {
            executorService.execute(() -> {
                String s1 = UUID.randomUUID().toString();
                setThreadLocal(s1);
                System.out.println("ThreadName【" + Thread.currentThread().getName()+"】set " + s1);
                String s = getThreadLocal();
                System.out.println("ThreadName【" + Thread.currentThread().getName()+"】get " + s);
                removeThreadLocal();
            });
        }
    }
}
