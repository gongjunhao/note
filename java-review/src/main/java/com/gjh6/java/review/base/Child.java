package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-02
 * Time: 5:05 PM
 */
public class Child extends Parent {
    static {
        System.out.println("Child init");
    }

    public Child() {
        System.out.println("Child new instance");
    }
}
