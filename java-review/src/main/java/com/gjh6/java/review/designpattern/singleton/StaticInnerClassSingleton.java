package com.gjh6.java.review.designpattern.singleton;

/**
 * 静态内部类方式实现的线程安全的单例模式
 */
public class StaticInnerClassSingleton {

    /**
     * 私有化构造函数
     */
    private StaticInnerClassSingleton() {

    }

    /**
     * 静态内部类  第一次被使用时被加载，由底层Jvm创建，保证线程安全
     * 静态变量，静态方法，静态块等都是类级别的属性，而不是单纯的对象属性。他们在类第一次被使用时被加载（记住，是一次使用，不一定是实例化）
     */
    static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    /**
     * 暴露获取实例接口
     * @return
     */
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0; i<30; i++) {
            StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
            System.out.println(instance);
        }
    }

}
