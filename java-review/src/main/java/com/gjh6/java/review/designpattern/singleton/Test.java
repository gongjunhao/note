package com.gjh6.java.review.designpattern.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-18
 * Time: 9:17 PM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
        EnumSingleton.INSTANCE.someMethod();
    }
}
