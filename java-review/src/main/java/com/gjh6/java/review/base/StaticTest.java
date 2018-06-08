package com.gjh6.java.review.base;

import java.util.HashMap;
import java.util.Map;

public class  StaticTest {
    static Map<String, Object> objectMap = new HashMap<>();

    public static void main(String[] args) {
        StaticTest.objectMap.put("1", "1");
        System.out.println(StaticTest.objectMap.get("1"));
        StaticTest.getSometing();
    }

    public static void getSometing() {
        System.out.println("static method!");
    }
}
