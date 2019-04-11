package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-03-02
 * Time: 10:53 AM
 */
public class Test {
    public static void main(String[] args) {
        Father son = new Son();
        son = null;
        System.gc();
    }
}
