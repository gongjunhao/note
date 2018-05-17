package com.gjh6.java.review.designpattern.singleton;

/**
 * 单例模式
 * 懒汉，双重检验
 * 多线程环境下安全（不会出现多个实例）
 */
public class LazySingleton {

    //静态初始化实例为null
    //被volatile修饰的变量，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值，否则会出现指令重排导致多实例产生
    private static volatile LazySingleton instance = null;

    //私有化构造函数
    private LazySingleton() {
    }

    //双重检验 加锁，线程睡眠200，模拟多线程同时既访问
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    //验证多线程环境下是否会产生多个实例
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
