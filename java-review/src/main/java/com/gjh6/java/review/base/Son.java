package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-03-02
 * Time: 10:51 AM
 */
public class Son extends Father {
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类普通代码块");
    }

    public Son() {
        System.out.println("子类构造方法");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收！");
        super.finalize();
    }
}
