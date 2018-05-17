package com.gjh6.java.review.base;

public class BaseTypeTest {
    static char c;// = 'c';
    static boolean b;// = true;
    static int i;// = 1;
    static short s;// = 1;
    static long l;// = 1l;
    static float f;// = 1.2f;
    static double d;// = 3.3;
    public static void main(String[] args) {
        System.out.println("base type default value");
        System.out.println(c);
        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println("base type bytes length");
        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println("装箱拆箱");
        int[] is = {1, new Integer(1), 2};
        Integer[] is1 = {1, 2, 4};

    }
}
