package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-02
 * Time: 5:04 PM
 */
public class Parent {
    public static int value = 2;
    static {
        System.out.println("parent init");
    }

    public Parent() {
        System.out.println("parent new instance");
    }
}
