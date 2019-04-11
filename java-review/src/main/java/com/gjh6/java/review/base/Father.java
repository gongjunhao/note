package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-03-02
 * Time: 10:49 AM
 */
public class Father {
    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类普通代码块");
    }

    public Father() {
        System.out.println("父类构造函数");
    }
}
