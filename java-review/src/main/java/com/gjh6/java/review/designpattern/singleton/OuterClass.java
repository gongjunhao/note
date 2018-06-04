package com.gjh6.java.review.designpattern.singleton;

import java.util.Random;

public class OuterClass {
    private static long OUTER_DATE = System.currentTimeMillis();

    static {
        System.out.println("外部类静态块加载时间：\t\t" + System.currentTimeMillis());
    }

    public OuterClass() {
        timeElapsed();
        System.out.println("外部类构造函数时间：\t\t\t" + System.currentTimeMillis());
    }

    static class InnerStaticClass {
        public static long INNER_STATIC_DATE = System.currentTimeMillis();
    }

    class InnerClass {
        public long INNER_DATE = 0;
        public InnerClass() {
            timeElapsed();
            INNER_DATE = System.currentTimeMillis();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("外部类静态变量加载时间：\t\t" + outer.OUTER_DATE);
        System.out.println("非静态内部类加载时间:\t\t\t"+outer.new InnerClass().INNER_DATE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("静态内部类加载时间：\t\t\t"+InnerStaticClass.INNER_STATIC_DATE);
    }

    //单纯的为了耗时，来扩大时间差异
    private void timeElapsed() {
        for (int i = 0; i < 10000000; i++) {
            int a = new Random(100).nextInt(), b = new Random(100).nextInt();
            a = a + b;
        }
    }
}