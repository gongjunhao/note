package com.gjh6.java.review.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-20
 * Time: 9:19 AM
 */
public class Animal {

    String name;

    public Animal() {
        System.out.println("构造 Animal");
    }

    public Animal(String name) {
        this.name = name;
    }
}
